//============================================================================
// Name        : Assignment_3_que_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
#include <memory>

using namespace std;

class Texture{
	string name;
	int width;
	int height;

public:

	Texture(string name, int width, int height):name(name),width(width),height(height){
		cout<<"[Texture Loaded]"<<endl;
	}

	~Texture(){
		cout<<"Texture Released"<<endl;
	}

	void display() const{
		cout<<"Dimentions:"<<width<<" x "<<height<<endl;
	}
};

class Shader{
	string name;
	string type;

  public:
	Shader(string name, string type):name(name),type(type){
		cout<<"Shader Compiled"<<endl;
	}

	~Shader(){
		cout<<"Shader Destroyed"<<endl;
	}

	int getReferenceCount(shared_ptr<Shader>s){
		return s.use_count();
	}
};

class AudioClip{
	string name;
	double vertex;

  public:

	AudioClip(string name, double vertex):name(name),vertex(vertex){
		cout<<"Parameterized Constructor"<<endl;
	}

	string getName(){
		return name;
	}
	~AudioClip(){
		cout<<"Destructor called"<<endl;
	}
};


int main() {


	unique_ptr<Texture> text1 = make_unique<Texture>("player_sprite",512,512);
	text1->display();

	//unique_ptr<Texture> text2 = text1;


	unique_ptr<Texture> text2 = move(text1);
	cout<<"Text is null: "<<(text1 == nullptr ? "Yes" : "No")<<endl;
	text2->display();

	auto s = make_shared<Shader>("main_vert","vertex");
	cout<<"Ref count: "<< s.use_count()<<endl;

  {
	auto s1 = s;
	cout<<"Ref count: "<<s.use_count()<<endl;

	auto s2 = s;
	cout<<"Ref count: "<<s.use_count()<<endl;
  }

    cout<<"Ref count:"<<s.use_count()<<endl;
    s->getReferenceCount(s);

    auto audio = make_shared<AudioClip>("explosion",3.5);
    weak_ptr<AudioClip> observer = audio;

    if(auto clip = observer.lock()){
    	cout<<"Clip alive: "<<clip->getName() <<endl;
    }

    audio.reset();

    if(observer.expired()){
    	cout<<"Clip already uploaded."<<endl;
    }
}


