import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Predicate;


public class TransactionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      //Collection to store 5 Transaction Object
		
		List<Transaction> transactions = new ArrayList<>();
		
		//Taking input for 5 transaction
		for(int i=1;i<=5;i++) {
			System.out.println("Enter Details for transaction: " + i);
			System.out.println("Enter Transaction ID: ");
			int txId = sc.nextInt();
			
			System.out.print("Enter Transaction Date: ");
			LocalDate txDate = LocalDate.parse(sc.next());
			
			System.out.println("Enter Transaction Amount: ");
			float txAmount = sc.nextFloat();
			
			System.out.println("Enter Transaction Status: ");
			boolean txStatus = sc.nextBoolean();
			
			System.out.println("Enter Transaction Arrears: ");
			boolean txArrears = sc.nextBoolean();
			
			//Create transaction object
			Transaction transaction = new Transaction(txId, txDate, txAmount, txStatus, txArrears);
			transactions.add(transaction);
		}
		
		//Transactions where txAmount > 5000
		Predicate<Transaction> amountGreaterThan5000 = transaction -> transaction.txAmount > 5000;
		System.out.println("Transaction where amount > 5000: ");
		transactions.stream().filter(amountGreaterThan5000).forEach(System.out::println);
		
		//Transaction where txStatus is false
		
		Predicate<Transaction> statusFalse = transaction -> !transaction.txStatus;
		
		System.out.println("Transactions where status is false: ");
		transactions.stream().filter(statusFalse).forEach(System.out::println);
		
		//Lambda function to calculate amount due
		
		Function<Transaction, Float> amountDue = transaction ->{
			if(transaction.txArrears) {
				return transaction.txAmount + 500 + (transaction.txAmount * 18/100);
			}
			else {
				return transaction.txAmount;
			}
		};
		System.out.println("Amount Due for each Transaction.");
		transactions.forEach(transaction -> {
			float due = amountDue.apply(transaction);
			System.out.println("Transaction ID: " + transaction.txId + "| Amount: " + transaction.txAmount + 
					" | Arrears: " + transaction.txArrears +"| Amount Due: " + due );
		});
	}

}
