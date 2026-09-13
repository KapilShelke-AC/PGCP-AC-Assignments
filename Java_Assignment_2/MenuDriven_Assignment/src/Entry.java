import java.util.Scanner;
public class Entry {
	
	static Scanner sc = new Scanner(System.in);
	
	static Manager[] arrManager = new Manager[40];
	
	static Engineer[] arrEngineer = new Engineer[40];
	
	static SalesPerson[] arrSalesPerson = new SalesPerson[40];
	
	static int managerCount = 0;
	static int engineerCount = 0;
	static int salesPersonCount = 0;
	
	static int currentManager = -1;
	static int currentEngineer = -1;
	static int currentSalesPerson = -1;
	

	public static void main(String[] args) {
	 int choice;
	 do {
		 System.out.println("============================");
		 System.out.println("Employee Managment");
		 	
		 System.out.println("============================");
		 
		 System.out.println("1. Add an Employee");

		 System.out.println("2. Display");
		 System.out.println("3. Sort");
		 System.out.println("4. Save to File");
		 System.out.println("5. Load from file");
		 System.out.println("6. Exit");
		 
		 System.out.println("Enter your choice: ");
		 choice = sc.nextInt();
		 
		 switch(choice) {
		 case 1:
			 addEmployee();
			 break;
			 
			 
		 case 2:
			 System.out.println("Program exited.");
			 break;
			 
		default:
			System.out.println("Invalid Choice!");
		
		 }
		 
	  }while(choice != 6);
	}
	
	static void addEmployee() {
		int choice;
		do {
			System.out.println("----------Add Employee ----------");
			System.out.println("1.Manager");
			System.out.println("2.Engineer");
			System.out.println("3.Sales Person");
			System.out.println("4.Exit");
	       
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				addManager();
				break;
				
			case 2:
				addEngineer();
				break;
				
			case 3:
				addSalesPerson();
				break;
				
			case 4:
				break;
				
			default:
				System.out.println("Invalid Choice:");
			}
		} while(choice != 4);
	}
	
	static void addManager() {
		if(managerCount == arrManager.length) {
			System.out.println("Manager array is full");
			return;
		}
		
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the address:");
		String address = sc.nextLine();
		
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		
		System.out.println("Enter the Basic Salary:");
		float basicSalary = sc.nextFloat();
		
		System.out.println("Enter the HRA:");
		float hra = sc.nextFloat();
		
		arrManager[managerCount] = new Manager(name,address,age,true, basicSalary, hra);
		managerCount++;
		System.out.println("Manager Added Successfully");
	}
	
	static void addEngineer() {
		if(engineerCount == arrEngineer.length) {
			System.out.println("Engineer array is full");
		}
		
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the address:");
		String address = sc.nextLine();
		
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		
		System.out.println("Enter Basic Salary:");
		float basicSalary = sc.nextFloat();
		
		System.out.println("Enter Overtime");
		float overtime = sc.nextFloat();
		
		arrEngineer[engineerCount] = new Engineer(name, address, age, true, basicSalary, overtime);
		engineerCount++;
		System.out.println("Engineer Added Successfully");
		
	}
	
	static void addSalesPerson() {
		if(salesPersonCount == arrSalesPerson.length) {
			System.out.println("Sales Person array is full");
		}
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the address:");
		String address = sc.nextLine();
		
		System.out.println("Enter age:");
		int age = sc.nextInt();
		
		System.out.println("Enter basicSalary:");
		float basicSalary = sc.nextFloat();
		
		System.out.println("Enter Commission");
		float commission = sc.nextFloat();
		
		arrSalesPerson[salesPersonCount] = new SalesPerson(name, address, age, true, basicSalary, commission);
		salesPersonCount++;
		
		System.out.println("Sales Person added successfully");
	}
	
	
	
}
