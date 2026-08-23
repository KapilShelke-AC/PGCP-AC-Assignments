import java.util.Scanner;

class Numbers{
  public static void getInput(int N){
   for(int i=1;i<=N;i++){
     System.out.print(i + " ");
  }
}

public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a Number");
 int Num = sc.nextInt();
  
  getInput(Num);

  }
}


  
  
  

















