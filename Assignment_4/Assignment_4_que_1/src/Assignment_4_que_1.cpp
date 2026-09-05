//============================================================================
// Name        : Assignment_4_que_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
#include <stdexcept>
#include <iomanip>
#include <utility>

using namespace std;

class LedgerEntry{
	string description;
	double *amounts;
	int days;
	static int totalEntries;

public:
	LedgerEntry(const string& desc, int days){
		 this->description = desc;
		 amounts = new double[days]{};
		 totalEntries++;
		 cout<<"[LedgerEntry created]"<<description <<"("<<days<<"days)"<<endl;
	}
	LedgerEntry(const LedgerEntry& other): decription(other.description),days(other.days){
		amounts = new double[days];
		for(int i=0;i<days;i++){
			amounts[i] = other.amounts[i]
		}

		totalEntries++;
		cout<<"[Copy Contructor]"<<description<<endl;

	}
	LedgerEntry(LedgerEntry&& other) noexcept : description(move(other.description)),amounts(other.amounts),days(other.days){
		other.amounts = nullptr;
		other.days = 0;
		totalEntries++;
		cout<<"[Move constructor] Ownership transfered"<<endl;
	}
	LedgerEntry& operator=(const LedgerEntry& other){
		if(this != &other){
			delete[] amounts;
			description = other.description;
			days = other.days;
			amount = new double[days];

			for(int i=0;i<days;i++){
				amounts[i] = other.amounts[i];
			}
		}
		return *this;
	}
	LedgerEntry& operator=(LedgerEntry&& other) noexcept{
		if(this != &other){
			string oldDescription = other.description;

			delete[] amounts;

			description = move(other.description);
			amounts = other.amounts;
			days = other.days;
			other.amounts = nullptr;
			other.days = 0;
			cout<<"[Move Assignment] Ownership transferred from: "<<oldDescription<<endl;
		}
		return *this;
	}
	~LedgerEntry(){
		delete[] amounts;
		totalEntries--;

		if(!description.empty()){
			cout<<"[Destructor]" <<description<<"destroyed"<<endl;
		}
	}

	LedgerEntry operator+(const LedgerEntry& other)const{


	}

	bool operator==(const LedgerEntry& other) const{

	}

	bool operator>(const LedgerEntry& other) const{

	}

	double& operator[](int index){

	}

	const double& operator[](int index) const{

	}

	friend ostream& operator<<(ostream& out,const LedgerEntity& entry){

	}

	friend istream operator>>(istream& in, LedgerEntry& entry);


};

int main() {
	LedgerEntry jan("January Sales", 5);
	jan[0] = 1200.50;
	jan[1] = 3400.00;
	jan[2] = 800.75;
	jan[3] = 2100.00;
	jan[4] = 650.25;

	LedgerEntry feb("February Sales", 5);
	feb[0] = 900.00;
	feb[1] = 2200.50;
	feb[2] = 1750.00;
	feb[3] = 3000.00;
	feb[4] = 475.00;

	cout<<jan<<endl;
	cout<<feb<<endl;

	LedgerEntry combined = jan + feb;
	cout<<"Combined: "<<combined<<endl;

	cout<<"Jan == Feb : "<<(jan == feb ? "Yes" : "No")<<endl;
	cout<<"Jan > Feb : "<<(jan > feb ? "Yes" : "No")<<endl;

	LedgerEntry moved = move(jan);
	cout<<"After move, jan.amounts is null: "<<(/* check jan is empty */ true ? "Yes":"No")<<endl;
	cout<<"Moved entry: "<<moved <<endl;

		LedgerEntry q1("Q1 Total", 5);
		q1 = move(feb);
		cout<<"Q1 (moved from feb): "<<q1<<endl;

		cout<<"Live LedgerEntry Objects: "<<LedgerEntry::totalEntries<<endl;
		return 0;

}
