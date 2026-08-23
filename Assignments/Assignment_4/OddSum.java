import java.util.Scanner;

 class arrayElements{

    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];

    System.out.println("Enter 5 array elements: ");
    
     for(int i=0;i<5;i++){
        arr[i] = sc.nextInt();
     }
   System.out.println("Array elements are: ");
   
   for(int elem : arr[i]){
      System.out.print(arr[i] + " ");
   }
  }
}
