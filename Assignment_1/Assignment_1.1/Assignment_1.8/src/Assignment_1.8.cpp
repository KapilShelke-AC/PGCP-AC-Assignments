//============================================================================
// Name        : 8.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

      bool parsePacket(const int* rawData, int size, int** outMin, int** outMax){
    	  int minElem = INT_MAX;
    	  int maxElem = INT_MIN;
    	  for(int i=0;i<size;i++){
    		  if(rawData[i] < minElem){
    			  minElem = rawData[i];
    		  }
    		  if(rawData[i] > maxElem){
    			  maxElem = rawData[i];
    		  }
    	  }
	        if(size <= 0){
	        	cout<<"Pointers Unchanged"<<endl;
	        	return false;
	        }
	        else{
	         *outMin = new int(minElem);
	         *outMax = new int(maxElem);
	       }
	        return true;
      }

int main() {
	int packet[] = {45, 12, 67, 8, 55, 31};
	int* minPtr = nullptr;
	int* maxPtr = nullptr;

	if(parsePacket(packet, 6, &minPtr, &maxPtr)){
		cout<<"Calibration Min : "<<*minPtr<<endl;
		cout<<"Calibration Max : "<<*maxPtr<<endl;
	}
	delete minPtr;
	delete maxPtr;
	return 0;
}
