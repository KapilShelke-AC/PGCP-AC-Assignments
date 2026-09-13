
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Date objDate = new Date();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day:");
		 int day = sc.nextInt();
		
		System.out.println("Enter the month:");
		int month = sc.nextInt();
		
		objDate.setDate(day, month, 2026);
		objDate.addDays(10);
		
		objDate.display();
		sc.close();
		
	}

}
