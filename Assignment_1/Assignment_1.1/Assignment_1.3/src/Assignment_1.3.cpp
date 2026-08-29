

#include <bits/stdc++.h>
using namespace std;


int main() {

	float temp[3][3] = {{24.0, 31.5, 28.0},
			            {45.0, 22.0, 30.0},
			            {19.0, 27.5,50.2}};

	cout<<"         "<<"Room1"<<"   "<<"Room2"<<"   "<<"Room3"<<endl;


	for(int i=0;i<3;i++){
		cout<<"Floor :"<<i+1<<"  ";
	   for(int j=0;j<3;j++){
		   cout<<temp[i][j]<<"     ";

	   }
	   cout<<endl;
	}
	cout<<endl;
	cout<<endl;


	float maxi = temp[0][0];
	int maxRow = 0;
	int maxCol = 0;

   for(int i=0;i<3;i++){
	  for(int j=0;j<3;j++){

	    if(temp[i][j] > maxi){
	      maxi = temp[i][j];
		   maxRow = i;
		   maxCol = j;
	   }
     }
   }
     cout<<"Hottest Room :"<<"  "<<"Floor "<<maxRow+1<<","<<"  "<<"Room"<<" "<<maxCol+1<<"  ->"<<"  "<<maxi<<endl;

     float avg = 0;
     float maxAvg = 0;
     int hottestFloor = 0;

     for(int i=0;i<3;i++){
    	  float sum = 0;
    	 for(int j=0;j<3;j++){
    		 sum = sum + temp[i][j];
    	 }
    	  avg = sum/3;
    	  if(avg > maxAvg){
    		  maxAvg = avg;
    		  hottestFloor = i;
    	  }
     }
     cout<<"Hottest Floor :"<<"  "<<"Floor "<<hottestFloor+1<<"   "<<"avg "<<maxAvg<<"C"<<endl;

     int warningCount = 0;
     for(int i=0;i<3;i++){
    	 for(int j=0;j<3;j++){
    		 if(temp[i][j] >= 30){
    			 warningCount++;
    		 }
    	 }
     }
     cout<<"Rooms at WARNING or above : "<<warningCount<<endl;
   return 0;

}
