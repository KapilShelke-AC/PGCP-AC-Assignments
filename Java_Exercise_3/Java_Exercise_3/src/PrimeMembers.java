import java.util.Scanner;

public class PrimeMembers extends Member{
   private int joiningYear;
   private float joiningFees;
   private boolean isActive;
   
   
   public PrimeMembers(String name, int age, String phoneNo, String address,float salary, int joiningYear, float joiningFees, boolean isActive) {
	    super(name, age, phoneNo, address, salary);
	    this.joiningYear = joiningYear;
	    this.joiningFees = joiningFees;
	    this.isActive = isActive;
	    
   }
 
   
   public void setJoiningYear(int joiningYear) {
	   this.joiningYear = joiningYear;
   }
   
    int getJoiningYear() {
	   return joiningYear;
   }
    
    public void setJoiningFees(float joiningFees) {
    	this.joiningFees = joiningFees;
    }
    
    float getJoiningFees() {
    	return joiningFees;
    }
    
    public void setActive(boolean isActive) {
    	this.isActive = isActive;
    }
    
    @Override
    public void display() {
    	super.display();
    	
    	System.out.println("JoiningYear: " + joiningYear);
    	System.out.println("JoiningFees: " + joiningFees);
    	System.out.println("isActive: " + isActive);
    }
    
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name");
	String name = sc.nextLine();
	
	System.out.println("Enter age");
	int age = sc.nextInt();
	
	System.out.println("Enter phone no");
	String phoneNo = sc.nextLine();
	
	System.out.println("Enter address");
	String address = sc.nextLine();
	
	System.out.println("Enter salary");
	float salary = sc.nextFloat();
	
	System.out.println("Enter Joining Year");
	int joiningYear = sc.nextInt();
	
	System.out.println("Enter Joining Fees");
	float joiningFees = sc.nextFloat();
	
	System.out.println("Is Active? : True or False");
	boolean isActive = sc.nextBoolean();
	
	PrimeMembers m = new PrimeMembers("Kapil", 23, "9404280298", "Nagpur", 50000, 2025, 30000, true);
	
	System.out.println("Prime Number Details");
	
	m.setName("Ujjwal");
	m.setAge(25);
	m.setPhoneNo("1234567890");
	m.setAddress("Pune");
	m.setSalary(70000);
	m.setJoiningYear(2020);
	m.setJoiningFees(10000);
	m.setActive(isActive);
	
	
	m.display();
	
	

	
	
}

}


