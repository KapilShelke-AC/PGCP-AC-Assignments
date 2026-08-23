import java.util.Scanner;

class LargestElement{

int largestElement(int[] arr){
  int maxElem = INT_MIN;

   for(int i=0;i<arr.size();i++){
       if(arr[i] > maxElem){
            maxElem = arr[i];
        }
   }
      return maxElem;
 }

 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int[] arr = new int[5];
    
    System.out.println("Enter 5 array elements:");

     for(int i=0;i<5;i++){
       arr[i] = sc.next();
    }
    
     LargestElement obj = new LargestElement();
      int result = obj.largestElement(arr);

     System.out.println("Largest element is:" + result);


  }
}
