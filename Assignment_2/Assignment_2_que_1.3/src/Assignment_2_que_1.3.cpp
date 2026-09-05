//============================================================================
// Name        : 1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
class Entity{
	string name;
	int health;
	int level;
	string type;

public:
   Entity& setName(const string& name){
	   this->name = name;
	   return *this;
   }
   Entity& setHealth(int health){
	   this->health = health;
	   return *this;
   }
   Entity& setLevel(int level){
	   this->level = level;
	   return *this;
   }
   Entity& setType(const string& type){
	   this->type = type;
	   return *this;
   }

   string getName() const{
	   return this->name;
   }
   int getHealth() const{
	   return this->health;
   }
   int getLevel() const{
	   return this->level;
   }
   string getType() const{
	   return this->type;
   }

   void displayInfo() const{
       cout<<"Name:"<<name<<"    "<<"Health:"<<health<<"     "<<"Level:"<<level<<"     "<<"Type:"<<type<<endl;
   }
};
 namespace Physics
 {
	 double clamp(double val, double min, double max){
          if(val > min && val >= max){
        	  return val;
          }
          else if(val < 0){
        	  return 0;
          }
          else{
        	  return max;
          }
	 }
	 double lerp(double a, double b, double t){
           return (a + (b-a) * t);
	 }
 }
 namespace GameMath{
     int clamp(int val, int min, int max){
    	  if(val > min && val >= max){
    	       return val;
    	     }
    	  else if(val < 0){
    	       return 0;
    	   }
    	     else{
    	     return max;
    	 }
     }
     double lerp(double a, double b, double t){
    	return (a + (b-a) * t);
     }
 }




int main() {
	Entity player;
	Entity enemy;
	Entity item;

	player.setName("Aragorn").setHealth(100).setLevel(10).setType("Player");
	enemy.setName("Orc").setHealth(60).setLevel(5).setType("Enemy");
	item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");

	player.displayInfo();
	enemy.displayInfo();
	item.displayInfo();

    Physics::clamp(50.0,0.0,100.0);
    Physics::lerp(40.0,10.0,50.0);

    GameMath::clamp(30,0,30);
    GameMath::lerp(20.0,10.0,50.0);

    {
    	using namespace Physics;
    	clamp(50.0,0.0,100.0);
    	lerp(40.0,10.0,50.0);
    }
    {
    	using namespace GameMath;
    	clamp(30,0,30);
    	lerp(20.0,10.0,50.0);
    }

    cout<<"Enter Rows:"<<endl;
    int rows;
    cin>>rows;

    cout<<"Enter Cols:"<<endl;
    int cols;
    cin>>cols;

    int **twoDArr = new int*[rows];
    for(int i=0;i<rows;i++){
    	twoDArr[i] = new int[cols];
    }
    cout<<"===== GAME MAP (3 x 4) ===="<<endl;


    for(int i=0;i<rows;i++){
    	for(int j=0;j<cols;j++){
    		cin>>twoDArr[i][j];
    	}
    }

    for(int i=0;i<rows;i++){
    	for(int j=0;j<cols;j++){
    		cout<<twoDArr[i][j]<<"  ";
    	}
    	cout<<endl;
    }

    cout<<"Legend: 0 = Grass   1 = Water   2 = Mountain   3 = Forest   4 = Dungeon"<<endl;
    int grassCount = 0;
    int waterCount = 0;
    int mountainCount = 0;
    int forestCount = 0;
    int dungeonCount = 0;


    for(int i=0;i<rows;i++){
    	for(int j=0;j<cols;j++){
    		if(twoDArr[i][j] == 0){
    			grassCount++;
    		}
    		else if(twoDArr[i][j] == 1){
    			waterCount++;
    		}
    		else if(twoDArr[i][j] == 2){
    			mountainCount++;
    		}
    		else if(twoDArr[i][j] == 3){
    			forestCount++;
    		}
    		else{
    			dungeonCount++;
    		}
    	}
    }

    cout<<"Tile Count:"<<endl;
    cout<<"Grass      :"<<grassCount<<endl;
    cout<<"Water      :"<<waterCount<<endl;
    cout<<"Mountain   :"<<mountainCount<<endl;
    cout<<"Forest     :"<<forestCount<<endl;
    cout<<"Dungeon    :"<<dungeonCount<<endl;

    for(int i=0;i<rows;i++){
    	delete[] twoDArr[i];
    }

      delete[] twoDArr;

	return 0;
}
