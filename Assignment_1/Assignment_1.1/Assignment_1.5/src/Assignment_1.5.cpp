//============================================================================
// Name        : 5.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

//Call by value
void resetSensorPairV1(int reading1, int reading2){
	int temp = reading1;
    reading1 = reading2;
	reading2 = temp;
}

//Call by reference
void resetSensorPairV2(int& reading1, int& reading2){
	int temp1 = reading1;
	reading1 = reading2;
	reading2 = temp1;
}

//Call by pointer
void resetSensorPairV3(int* reading1, int* reading2){
	int temp2 = *reading1;
	*reading1 = *reading2;
	*reading2 = temp2;
}

int main() {
	int a = 55;
	int b = 12;

	cout<<"---V1: Call by Value ---"<<endl;
	cout<<"Before :"<<" "<<"A"<<"="<<a<<"  "<<"B"<<"="<<b<<endl;
	resetSensorPairV1(a, b);
	cout<<"After  :"<<" "<<"A"<<"="<<a<<"  "<<"B"<<"="<<b<<"      "<<"<-"<<" "<<"values unchanged"<<endl;


	cout<<"---V2: Call by Reference ---"<<endl;
    cout<<"Before :"<<" "<<"A"<<"="<<a<<"  "<<"B"<<"="<<b<<endl;
	resetSensorPairV2(a, b);
	cout<<"After  :"<<" "<<"A"<<"="<<a<<"  "<<"B"<<"="<<b<<"      "<<"<-"<<" "<<"values swapped"<<endl;

	cout<<"---V3: Call by Pointer ---"<<endl;
	cout<<"Before :"<<" "<<"A"<<"="<<a<<"  "<<"B"<<"="<<b<<endl;
    resetSensorPairV3(&a, &b);
	cout<<"After  :"<<" "<<"A"<<"="<<a<<"  "<<"B"<<"="<<b<<"      "<<"<-"<<" "<<"values swapped back"<<endl;


}
