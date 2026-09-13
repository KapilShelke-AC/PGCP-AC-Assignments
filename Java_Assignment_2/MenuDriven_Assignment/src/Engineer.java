
public class Engineer extends Employee {
	protected float overtime;
    
	public Engineer(String name, String address, int age, boolean gender, float basicSalary, float overtime) {
		super(name, address, age, gender, basicSalary);
		this.overtime = overtime;
	}
  
	public float getOvertime() {
		return overtime;
	}
	
	public void setOvertime(float overtime) {
		this.overtime = overtime;
	}
	
	@Override
	public void display() {
		System.out.println("Engineer Details");
		System.out.println("Name     :" + name);
		System.out.println("Address     :" + address);
		System.out.println("Age     :" + age);
		System.out.println("Gender    :" + gender);
		System.out.println("Basic Salary     :" + basicSalary);
		System.out.println("Overtime     :" + overtime);
	}
}
