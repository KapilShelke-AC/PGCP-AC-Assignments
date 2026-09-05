//============================================================================
// Name        : Assignment_3_que_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
#include <vector>
#include <utility>
using namespace std;

enum class HttpStatus{
	OK           = 200,
	Created      = 201,
	BadRequest   = 400,
	Unauthorized = 401,
	NotFound     = 404,
	ServerError  = 500
};
  void handleResponce(HttpStatus status, const string& endpoint){
	  cout<<"["<<endpoint<<"] ->";
	  switch(static_cast<int>(status)){
	  case 200:
		  cout<<"200 OK"<<"     : Request Successfull";
		  break;
	  case 201:
		  cout<<"201 Ok"<<"     : Created Resource create successfully";
		  break;
	  case 400:
		  cout<<"400 Bad Request"<<"    : Invalid";
		  break;
	  case 401:
		  cout<<"401 unauthorized"<<"    : Authentication required";
		  break;
	  case 404:
		  cout<<"404 NotFound"<<"    : Endpoint does not exist";
		  break;
	  case 500:
		  cout<<"500 ServerError"<<"    : Internal server error - retry later";
		  break;
	  default:
		  cout<<"Unknown status";
		  break;
      }
	  cout<<endl;
  }


  using Header = pair<string, string>;
  using HeaderList = vector<Header>;
  using Port = unsigned int;
  using IPAddress = string;

  typedef unsigned long long RequestId;

  void printHeaders(const HeaderList& headers){
	  cout<<"Headers:"<<endl;

	  for(const Header& header : headers){
		  cout<<"   "<<header.first<<"   :   "<<header.second<<endl;
	  }
  }


int main() {
	handleResponce(HttpStatus::OK,"[GET/api/users]");
	handleResponce(HttpStatus::Unauthorized,"[POST/api/login]");
	handleResponce(HttpStatus::BadRequest,"[GET/api/products]");
	handleResponce(HttpStatus::ServerError,"[POST/api/order");

	HeaderList headers = { {"content-Type", "application/json"},
			{"Authorization", "Bearer eyjhbGci..."},
			{"Accept-Language", "en-US"}
	};

	Port serverPort = 8080;

	RequestId requestId = 1748293847;

	cout<<"Request ID    :"<<requestId<<endl;
	cout<<"Server Port   :"<<serverPort<<endl;
	 printHeaders(headers);


	return 0;
}
