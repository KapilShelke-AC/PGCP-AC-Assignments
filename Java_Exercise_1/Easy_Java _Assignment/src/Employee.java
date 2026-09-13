
public class Employee {
	
	String name;
	int yearOfJoining;
	int salary;
	String address;
	
	Employee(String name, int yearOfJoining, int salary, String address){
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}
	
	void Display() {
		System.out.println(name + "   " + yearOfJoining + "   " + address);
	}
	

	public static void main(String[] args) {
		
		/*Employee e1 = new Employee("Kapil", 2021, 50000, "Nagpur");
		Employee e2 = new Employee("Ujjwal",2022, 70000, "Mumbai");
		Employee e3 = new Employee("Piyush", 2023, 40000, "Mumbai");*/
		
		Employee[] employees = new Employee[3];
		
		employees[0] = new Employee("Kapil", 2021, 50000, "Nagpur");
		employees[1] = new Employee("Ujjwal",2022, 70000, "Mumbai");
		employees[2] = new Employee("Piyush", 2023, 40000, "Mumbai");
		
		
		
		System.out.println("Name" + "   " + "Year OF Joining" + "   " + "Address");
		for(int i = 0;i<employees.length;i++) {
			employees[i].Display();
		}
	}

}
