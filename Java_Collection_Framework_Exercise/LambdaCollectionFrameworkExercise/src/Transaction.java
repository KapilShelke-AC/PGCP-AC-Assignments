import java.time.LocalDate;
public class Transaction {
    int txId;
    LocalDate txDate;
    float txAmount;
    boolean txStatus;
    boolean txArrears;
    
    public Transaction(int txId,LocalDate txDate, float txAmount,boolean txStatus, boolean txArrerars) {
    	this.txId = txId;
    	this.txDate = txDate;
    	this.txAmount = txAmount;
    	this.txStatus = txStatus;
    	this.txArrears = txArrears;
    }
   //Display transaction Details
    @Override
    public String toString() {
    	return ;
    }
   
   
}
