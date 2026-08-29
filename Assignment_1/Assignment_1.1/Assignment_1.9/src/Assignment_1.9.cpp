//============================================================================
// Name        : 9.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;

 inline double distanceBetween(double x1, double y1, double x2, double y2){
	 double square =  sqrt(pow(x2-x1,2) + pow(y2-y1,2));
	 return square;
 }

 inline double toRadius(double degrees){
	 degrees = (M_PI / 180.0);
	 return degrees;
 }

   inline double clamp(double value, double minVal, double maxVal){
	   if(value < minVal){
	       	 return minVal;
	     }
	     if(value > maxVal ) {
	    	 return maxVal;
	     }
	     return value;
 }

 inline bool isInSafeZone(double x, double y, double cx, double cy, double radius){

 }

int main() {
	 double res1 = distanceBetween(10.0,20.0,5.0,60.0);
	 cout<<res1<<endl;

	 double res2 = toRadius(60);
	 cout<<res2<<endl;

	 double res3 = (10.0,0.0,0.0);
	 cout<<res3<<endl;

}
