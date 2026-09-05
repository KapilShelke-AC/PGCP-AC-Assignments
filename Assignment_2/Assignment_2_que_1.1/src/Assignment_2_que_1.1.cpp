//============================================================================
// Name        : 1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Product{

	int productId;
	string name;
	double price;
	int quantity;

public:
	int getProductId() const{
		return productId;
	}
	string getName() const{
		return name;
	}
	 void acceptDetails(){
         cout<<"Enter product ID:"<<endl;
         cin>>productId;
         cout<<"Enter product name:"<<endl;
         cin>>name;
         cout<<"Enter product price:"<<endl;
         cin>>price;
         cout<<"Enter product quantity:"<<endl;
         cin>>quantity;
	 }

	 void displayDetails(int threshold) const{
         cout<<productId<<"   "<<name<<"    "<<price<<"    "<<quantity<<"    "<<totalValue()<<endl;

         if(isLowStock(threshold)){
        	 cout<<"<- LOW STOCK";
         }
         cout<<endl;
	 }

	 double totalValue() const{
	        return price * quantity;
	   }

	 bool isLowStock(int threshold) const{
		 return quantity < threshold;
	 }
};
double reorderCost(int qty,double unitPrice){

}
double reorderCost(double qty, double unitPrice){

}
double reorderCost(int qty, double unitPrice, double taxRate){

}
double applyDiscount(double price, double discountPercent = 10.0){

}


int main() {
	Product products[5];
	int threshold;
		cout<<"Enter low-stock threshold:";
		cin>>threshold;

	for(int i=0;i<5;i++){
		products[i].acceptDetails();
	}
	cout<<"ID"<<"    "<<"Name"<<"        "<<"Price"<<"      "<<"Quantity"<<"    "<<"Total Value"<<endl;
	for(int i=0;i<5;i++){
		products[i].displayDetails(threshold);
	}

	int highestIndex = 0;
	for(int i=1;i<5;i++){
		if(products[i].totalValue() > products[highestIndex].totalValue()){
			highestIndex = i;
		}
	}

	cout<<"Highest Value Product :"<<products[highestIndex].getName()<<" (Rs. "<<products[highestIndex].totalValue()<<")\n";


	cout<<"Stock products threshold: "<<threshold <<")\n";

	bool found = false;
	for(int i=0;i<5;i++){
		if(products[i].isLowStock(threshold)){
			products[i].getName();
			found = true;
		}
	}
	if(!found){
		cout<<"No products are below the threshold.\n";
	}
	reorderCost(3,50.6);
	reorderCost(30.0, 40.0);
	reorderCost(3,40.0,10.0);
	applyDiscount(90.0,10.0);

	return 0;
}
