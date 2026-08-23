import java.util.Scanner;

class PositiveNumber{
 
   public static int askForPositiveNumber(){
    Scanner sc = new Scanner(System.in);
     int number;

    do{
     System.out.print("Enter positive Num:");
     number = sc.nextInt();
     
  
   }while(number <= 0);

     return number;
  }
 
   public static void main(String[] args){

  

     int positiveNum = askForPositiveNumber();
    System.out.println("You entered a positive no :" + positiveNum);

  }
}

  

















