import java.util.Scanner;
public class ComplexNumber {
  private int num1;
  private int num2;
  
  public void setNum1(int num1) {
	  this.num1 = num1;
  }
  int getNum1() {
	  return num1;
  }
  
  public void setNum2(int num2) {
	  this.num2 = num2;
  }
  
  int getNum2() {
	  return num2;
  }
  
  public int computeComplexNumber() {
	   return num1 * num2;
  }
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  ComplexNumber[] arr= new ComplexNumber[5];
	  
	  for(int i=0;i<arr.length;i++) {
		  arr[i] = new ComplexNumber();
		  System.out.print("Enter first Number: ");
		  int n1 = sc.nextInt();
		  
		  System.out.print("Enter second Number: ");
		  int n2 = sc.nextInt();
		  
		  arr[i].setNum1(n1);
		  arr[i].setNum2(n2);
	  }
	  
	  System.out.println("Reaults:");
	  for(int i=0;i<5;i++) {
		  int res = arr[i].computeComplexNumber();
		  System.out.println(arr[i].getNum1() + "*" + arr[i].getNum2() + "=" + res);
	  }
  }
}
