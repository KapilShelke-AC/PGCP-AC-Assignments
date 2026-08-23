import java.util.Scanner;

class MultipleOfThree{

  void print(int N){
   for(int i=3;i<=N;i=i+3){
     System.out.print(i + " ");
  }
 }
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Number: ");

   int Num = sc.nextInt();
   
   MultipleOfThree obj = new MultipleOfThree();
   obj.print(Num);


  }
}


  
  
  

















