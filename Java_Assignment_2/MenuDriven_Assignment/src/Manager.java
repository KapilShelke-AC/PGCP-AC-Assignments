
public class Manager extends Employee {
	 protected float hra;
	 
	 public Manager(String name, String address, int age, boolean gender, float basicSalary, float hra) {
		 super(name,address, age, gender, basicSalary);
		 this.hra = hra;
	 }
	 
	 public float getHra() {
		 return hra;
	 }
	 
	 public void setHra(float hra) {
		 this.hra = hra;
	 }
	 @Override
	 public void display() {
		 System.out.println("Manager Details");
		 System.out.println("Name     :" + name);
		 System.out.println("Address     :" + address);
		 System.out.println("Age      :" + age);
		 System.out.println("Gender     :" + gender);
		 System.out.println("Basic Salary    :" + basicSalary);
		 System.out.println("HRA     :" + hra);
	 }
}
