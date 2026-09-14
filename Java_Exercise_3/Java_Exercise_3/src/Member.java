import java.util.Scanner;
public class Member {
    private String name;
    private int age;
    private String phoneNo;
    private String address;
    private float salary;
    
   public Member(String name, int age, String phoneNo, String address, float salary){
    	this.name = name;
    	this.age = age;
    	this.phoneNo = phoneNo;
    	this.address = address;
    	this.salary = salary;
    }
    
     public void setName(String name) {
    	 this.name =name;
     }
     
      String getName() {
    	 return name;
     }
      
      public void setAge(int age) {
    	  this.age = age;
      }
      
      int getAge() {
    	  return age;
      }
      
      public void setPhoneNo(String phoneNo) {
    	  this.phoneNo = phoneNo;
      }
      
      String getPhoneNo() {
    	  return phoneNo;
      }
      
      public void setAddress(String address) {
    	  this.address = address;
      }
      
      String getAddress() {
    	  return address;
      }
      
      public void setSalary(float salary) {
    	  this.salary = salary;
      }
      
      float getSalary() {
    	  return salary;
      }
      
      
    void printSalary() {
    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    	System.out.println("Phone No: " + phoneNo);
    	System.out.println("address: " + address);
    	System.out.println("salary: " + salary);
    	
    }
    
    void display() {
    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    	System.out.println("Phone No: " + phoneNo);
    	System.out.println("address: " + address);
    	System.out.println("salary: " + salary);
    }
}
    
 
