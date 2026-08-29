//============================================================================
// Name        : 4.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main(int argc, char* argv[]){
	if(argc != 4){
		cout<<"Usage :  ./sensor_monotor <warn_threshold>  <critical_threshold> <num_readings>"<<endl;
		cout<<"Error : Missing Arguments."<<endl;
		return 1;
	}

	int warn = stoi(argv[1]);
	int critical = stoi(argv[2]);
	int readings = stoi(argv[3]);


	 if(warn >= critical){
		cout<<"Error: Warn threshold must be less than Critical threshold. "<<endl;
		return 1;
	}
	 if(readings < 1 && readings > 500){
		cout<<"Error: num_readings must be in the range of 1 to 500"<<endl;
		return 1;
	}

	 cout<<"Config : Warn = " <<warn<<"C"<<"   "<<"Critical = "<<critical<<"   "<<"Readings = "<<readings<<endl;

	 srand(time(0));
	 int normal = 0;
	 int warning = 0;
	 int criticalCount = 0;
	 int shutdown = 0;

	 for(int i=0;i<readings;i++){
		 int temp = rand() % 70;

		 if(temp < warn){
			 normal++;
		 }
		 else if(temp < critical){
			 warning++;
		 }
		 else if(temp < 60){
			 criticalCount++;
		 }
		 else{
			 shutdown++;
		 }
	 }

	 cout<<"Results : Normal :"<<normal<<"  "<<"Warning:"<<warning<<"  "<<"Critical:"<<criticalCount<<"  "<<"Shutdown:"<<shutdown<<endl;
	 return 0;

}
