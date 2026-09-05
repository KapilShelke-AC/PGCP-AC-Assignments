//============================================================================
// Name        : Assignment_3_que_3.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstring>
using namespace std;

class LogBuffer{
	char *buffer;
	int capacity;
	int size;
	static int instanceCount;

public:
	LogBuffer(int capacity){
		 this->capacity = capacity;
		 this->size = 0;
		 buffer = new char[capacity];
		 buffer[0] = '\0';
		 instanceCount++;
		 cout<<"[LogBuffer Created] capacity ="<<capacity<<endl;
	}

	LogBuffer(const LogBuffer& other){
		capacity = other.capacity;
		size = other.size;
		buffer = new char[capacity];
		memcpy(buffer, other.buffer,size+1);
		instanceCount++;
		cout<<"[LogBuffer Deep Copied] capacity="<<capacity<<endl;
	}

	LogBuffer& operator=(const LogBuffer& other){
		if(this == &other){
			cout<<"[Self assignment detected - no operation]"<<endl;
			return *this;
		}
		delete[] buffer;
		capacity = other.capacity;
		size = other.size;

		buffer = new char[capacity];
		memcpy(buffer, other.buffer, size+1);
		cout<<"[LogBuffer Assigned]"<<endl;
		return *this;
	}
	~LogBuffer(){
		delete[] buffer;
		instanceCount--;
		cout<<"[LogBuffer Destroyed]"<<endl;
	}

	void append(const char* msg){
		int msgLength = strlen(msg);
		if(size + msgLength >= capacity){
			msgLength = capacity - size -1;
		}
		if(msgLength > 0){
			memcpy(buffer + size, msg, msgLength);
			size += msgLength;
			buffer[size] = '\0';
		}
	}
	void print() const{
		cout<<buffer<<endl;
	}
	void clear(){
		size = 0;
		buffer[0] = '\0';
	}
	static int getInstanceCount(){
		return instanceCount;
	}
};
int LogBuffer::instanceCount = 0;

int main() {
	LogBuffer log1(256);
	log1.append("Server Started on port 8080");
	log1.append(" | Request received from 192.168.1.10");
	log1.print();

	LogBuffer log2 = log1;
	log2.append(" | Catched responce sent");
	cout<<"log1 : "; log1.print();
	cout<<"log2 :"; log2.print();

	LogBuffer log3(128);
	log3 = log1;
	log3.print();

	log1 = log1;
	log1.print();

	cout<<"Live LogBuffer Objects : "<<LogBuffer::getInstanceCount()<<endl;
	return 0;
}
