import java.util.Scanner;

 class StringArray{

   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);

   String[] arr = new String[4];

   System.out.println("Enter 4 string names: ");
 
   for(int i=0;i<4;i++){
     String[i] = sc.next();
  }
   
   System.out.println("String elements are: ");

   for(String elem : arr){
     System.out.print(elem + " ");
   }
  }
}

