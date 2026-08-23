import java.util.Scanner;

 class CountNum{

  void count(int[] arr){

   int positiveCount = 0;
   int negativeCount = 0;
   
   for(int i=0;i<6;i++){
    if(arr[i] > 0){
       PositiveCount++;
       System.out.println(positiveCount);
    }
     if(arr[i] < 0){
      negativeCount++;
      System.out.println(negativeCount);
    }

 }
  public static void main(String[] args){
 
   Scanner sc = new Scanner(System.in);
   
    int[] arr = new int[6];
    
    System.out.println("Enter 6 array elements:");

    for{int i=0;i<6;i++){
        arr[i] = sc.nextInt();
    }
    
    CountNum obj = new CountNum();
     obj.count(arr);
    
 }

