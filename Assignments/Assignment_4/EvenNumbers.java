import java.util.Scanner;

class OddSum{

  int oddNumSum(int N){
   int sum = 0;
   for(int i=1;i<=N;i++){
       
     if(i % 2 != 0){
       sum = sum + i;
    }
  }
    return sum;

}
 
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
     System.out.println("Enter a Number: ");

      int Num = sc.next();
 
        OddSum obj = new OddSum();
         obj.oddSumNum(Num);

        System.out.println("Odd sum is: ");
    
  }
}