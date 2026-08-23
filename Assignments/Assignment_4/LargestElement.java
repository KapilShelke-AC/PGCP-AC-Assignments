import java.util.Scanner;

class CalculateAvg{
  
 int findAvg(int[] arr){
   int sum = 0;
   int avg;

   for(int i=0;i<arr.length;i++){
      sum = sum + arr[i];
   }
 
   avg = sum / 5;

   return avg;

 }
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
     int[] arr = new int[5];
     System.out.println("Enter 5 elements of Array:");
     
    for(int i=0;i<5;i++){
       arr[i] = sc.nextInt();
    }
  
     CalculateAvg obj = new CalculateAvg();
     int result = obj.findAvg(arr);
   
    System.out.println("Avg of these elements is:" + result);
  
  }
}

