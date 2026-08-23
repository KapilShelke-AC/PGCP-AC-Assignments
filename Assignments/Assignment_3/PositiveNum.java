class PositiveNumber{
 
   public static void askForPositiveNumber(){

    Scanner sc = new Scanner(System.in);
    int number;
    
    do{
     System.out.print("Enter positive Num:");
     number = sc.nextInt();
  
   }while(num <= 0);

     return num;
  }
 
   public static void main(String[] args){

     int positiveNum = askForPositiveNumber();
    System.out.println("You entered a positive no :" + positiveNum);

  }
}

  

















