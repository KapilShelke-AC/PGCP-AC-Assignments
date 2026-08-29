

#include <iostream>
using namespace std;

int main(){
	int range;
	cout<<"Enter Temperature:"<<endl;
	cin >> range;

	int statusCode;

     if(range < 0){
    	 statusCode = -1;
     }
     else if(range >= 0 && range <= 29){
    	 statusCode = 0;
     }
     else if(range >= 30 && range <= 44){
    	 statusCode = 1;
     }
     else if(range >= 45 && range <= 59){
    	 statusCode = 2;
     }
     else if(range >= 60){
    	 statusCode = 3;
     }

     int f = ((range * 9)/5) + 32;
     cout<<"Temperature:"<<" "<<range<<"/"<<f<<endl;

     switch(statusCode){
     case -1:
    	 cout<<"Status:"<<" "<<"SENSOR_ERROR"<<endl;
    	 cout<<"Action:"<<" "<<"Sensor fault-check writing"<<endl;
    	 break;

     case 0:
    	 cout<<"Status:"<<" "<<"NORMAL"<<endl;
    	 cout<<"Action:"<<" "<<"No Action Required"<<endl;
    	 break;

     case 1:
    	 cout<<"Status:"<<" "<<"WARNING"<<endl;
    	 cout<<"Action:"<<" "<<"Alert sent to supervisor"<<endl;
    	 break;

     case 2:
    	 cout<<"Status:"<<" "<<"CRITICAL"<<endl;
    	 cout<<"Action:"<<" "<<"Cooling system triggered"<<endl;
    	 break;

     case 3:
    	 cout<<"Status:"<<" "<<"SHUTDOWN"<<endl;
    	 cout<<"Action:"<<" "<<"Emergency shutdown initiated"<<endl;
    	 break;
    }
     cout<<"Reading:"<<" ";
     cout<<((range > 25) ? "Above Average" : "Below Average")<<endl;
}
