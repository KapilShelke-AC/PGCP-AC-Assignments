//============================================================================
// Name        : 7.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int statusReg = 0b10110001;
	int controlReg = 0b0000000;
	int dataReg = 0b11001010;

	const int* regPtr1 = &statusReg;
	cout<<"Status Register = "<<*regPtr1<<endl;

	//Error: we cannot modify the value through pointer-to-const.
	//Repointing is allowed with const int*

	  regPtr1 = &dataReg;
	  cout<<"After repointing = "<<*regPtr1<<endl;

	  int *const regPtr2 = &controlReg;
	  *regPtr2 = 25;
	  cout<<"Control Register = "<<*regPtr2<<endl;

	  const int* const regPtr3 = &statusReg;
	  cout<<"Status Register = "<<*regPtr3<<endl;

	  return 0;
}
