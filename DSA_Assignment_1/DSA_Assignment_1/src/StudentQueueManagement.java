import java.util.ArrayList;
import java.util.Scanner;

 public class StudentQueueManagement {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> queue = new ArrayList<>();
		
		int choice;
		do {
			System.out.println("==== Student Queue Managment ====");
			System.out.println("1. Add Student");
			System.out.println("Remove Student from front");
			System.out.println("Display Queue");
			System.out.println("Search Student");
			System.out.println("Count Students");
			System.out.println("Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Student Id:");
				int id = sc.nextInt();
				queue.add(id);
				System.out.println("Student added successfully!");
				break;
				
			case 2:
				if(queue.isEmpty()) {
					System.out.println("Queue is empty!");
				}else {
					int removed = queue.remove(0);
					System.out.println("Student "+ removed + "submitted the assignment.");
				}
				break;
				
			case 3:
				if(queue.isEmpty()) {
					System.out.println("Queue is Empty!");
				}else {
					System.out.println("Current queue: " + queue);
				}
				break;
			case 4:
				System.out.println("Enter student Id to search:");
				int searchId = sc.nextInt();
				if(queue.contains(searchId)){
					System.out.println("Student " + searchId + "is waiting.");
				}else {
					System.out.println("Student " + searchId + "is not waiting.");
				}
				break;
				
			case 5:
				System.out.println("Total Students waiting: "+ queue.size());
				break;
				
			case 6:
				System.out.println("Program Terminated.");
				break;
				
				default:
					System.out.println("Invalid Choice!");
			}
		}while(choice != 6);
		sc.close();
   
	}
}
