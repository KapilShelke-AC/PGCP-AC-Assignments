import java.util.Scanner;

class EvenNumbers{

  void evenNum(int N){

  for(int i=0;i<=N;i++){
   if(N % 2 == 0){
      System.out.print(i + " ");
   }

}
 
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number: ");

    int Num = sc.nextInt();

    EvenNumbers obj = new EvenNumbers();
    int result =  obj.evenNum(N);

   System.out.println("Even Numbers are: " + result);

  }
}