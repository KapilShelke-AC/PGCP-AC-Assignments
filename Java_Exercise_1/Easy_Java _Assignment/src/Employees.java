
public class Employees {
	
	double salary;
	int noOfHours;
	
	void getInfo(double salary, int noOfHours){
		this.salary = salary;
		this.noOfHours = noOfHours;
	}
	
	void addSal() {
		if(salary < 500) {
			salary = salary + 10;
		}
	}
	
	void addWork() {
		if(noOfHours > 6) {
			salary = salary + 5;
		}
	}

	void displaySalary() {
		System.out.println("Final Salary: $" + salary);
	}

	public static void main(String[] args) {
		Employees e = new Employees();
		
        e.getInfo(400, 7);
        e.addSal();
        e.addWork();
        e.displaySalary();
       
        
	}

}
