#include <iostream>
#include <cmath>
using namespace std;

int main(){

	double temp[] = {22.1, 31.5, 46.0, 28.0, 50.2, 10.0, 38.0, 29.6};

	int count = 0;

	for(int i=0;i<8;i++){
		if(temp[i] == 0){
			count++;
			continue;
		}
		cout<<temp[i]<<" ";
	}


	cout<<"Skipped (errors) :"<<" "<<count<<endl;

	for(int i=0;i<8;i++){
		if(temp[i] >= 45){
			cout<<"First CRITICAL :"<<"Index "<<i<<"->"<<temp[i]<<endl;
			break;
		}

	}

	double mini = INT_MAX;
	double maxi = INT_MIN;
	double sum = 0;

	   for(int i=0;i<8;i++){
		 mini = min(mini,temp[i]);
		 maxi = max(maxi,temp[i]);
		 sum = sum + temp[i];
	}

	int avg = sum/8;

	cout<<"Min :"<<mini<< "  "<<"Max :"<<maxi<<"  "<<"Avg :"<<avg<<endl;

	int normalCount =0;
	int warningCount =0;
	int criticalCount = 0;
	int shutdownCount = 0;
	int sensorCount = 0;


	for(int i=0;i<8;i++){

	if(temp[i] < 0){
		sensorCount++;
	}
	else if(temp[i] > 0 && temp[i] <= 29){
		normalCount++;
	}
	else if(temp[i] >= 30 && temp[i] <= 44){
		warningCount++;
	}
	else if(temp[i] >= 45 && temp[i] <= 59){
		criticalCount++;
	}
	else if(temp[i] >= 60){
		shutdownCount++;
	}
  }
	cout<<"Normal :"<<normalCount<<"  "<<"Warning :"<<warningCount<<"  "<<"Critical :"<<criticalCount<<"  "<<"shutdownCount: "<<shutdownCount<<endl;


}
