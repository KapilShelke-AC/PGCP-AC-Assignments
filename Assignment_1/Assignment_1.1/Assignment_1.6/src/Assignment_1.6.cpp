//============================================================================
// Name        : 6.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include <bits/stdc++.h>

double computerRMS(double* signal, int n){
	double sum = 0;
	for(int i=0;i<n;i++){
		sum = sum + (*(signal+i) * *(signal+i));
	}
	return sqrt(sum/n);
}

void normalise(double *signal, int n){
	int maxVal = 0;
	int ans;

	for(int i=0;i<n;i++){
		if(*(signal+i) > maxVal){
			maxVal = *(signal+i);
		}
	}
	for(int i=0;i<n;i++){
		 ans = *(signal+i)/maxVal;
	}
	cout<<"Normalise value is: "<<ans<<endl;
}

   int countZeroCrossings(double *signal, int n){
	   int count = 0;
	   for(int i=0;i<n-1;i++){
	      if(*(signal+i) > 0 && *(signal+i+1)< 0){
	    	  count++;
	      }
      }
	   return count;
   }

   void applyGain(double *signal, int n, double gainFactor){
	   int ans;
	   for(int i=0;i<n;i++){
		    ans = ans + (gainFactor * *(signal+i));
	   }
	   cout<<"applyGain is:"<<ans<<endl;
   }

int main() {
	cout<<"Enter size of array:";
	int n;
	cin>>n;

	double gainFactor;
	cin>>gainFactor;

	cout<<"Enter elements:"<<endl;
	double* signal = new double[n];

	for(int i=0;i<n;i++){
		cin >> *(signal+i);
	}

	double result = computerRMS(signal, n);
	cout<<result<<endl;

	 normalise(signal,n);

	 double finalRes = countZeroCrossings(signal,n);
	 cout<<"zeroCrossing are:"<<finalRes<<endl;

	 applyGain(signal,n, gainFactor);

	delete[] signal;



}
