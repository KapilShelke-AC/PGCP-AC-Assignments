
public class Student {
  String name;
  int roll_no;
  String phone_no;
  String address;
  

public static void main(String[] args) {
	Student obj = new Student();
	Student obj1 = new Student();
	obj.roll_no = 2;
	obj.name = "John";
	obj1.name = "Sam";
	obj.phone_no = "2437738229";
	
	System.out.println(obj.roll_no);
	System.out.println(obj.phone_no);
	System.out.println(obj.name);
	System.out.println( obj1.name);
	
	
}	
}
