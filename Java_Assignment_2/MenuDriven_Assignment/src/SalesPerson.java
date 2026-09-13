
public class SalesPerson extends Employee {
   protected float commission;
   
   public SalesPerson(String name, String address, int age, boolean gender, float basicSalary, float commission) {
	   super(name, address, age, gender, basicSalary);
	   this.commission = commission;
   }
   public float getCommission() {
	   return commission;
   }
   public void setCommision(float commission) {
	   this.commission = commission;
   }
   @Override
   public void display() {
	   System.out.println("Sales Person Details:");
	   System.out.println("Name     :" + name);
	   System.out.println("Address     :" + address);
	   System.out.println("Age    :" + age);
	   System.out.println("Gender     :" + gender);
	   System.out.println("Basic Salary    :" + basicSalary);
	   System.out.println("Commission     :" + commission);
   }
} 
