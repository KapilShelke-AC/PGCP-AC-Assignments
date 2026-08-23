import java.util.Scanner;

class SearchElement{
  
 void searchArrayElement(int[] arr, int N){
     for(int i=0;i<arr.length;i++){
      if(arr[i] == N){
        System.out.println("Found");
      }
   }
}
 
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
     int[] arr = new int[5];
     System.out.println("Enter 5 array elements:");
 
    for(int i=0;i<5;i++){
      arr[i] = sc.nextInt();
    }
     
    System.out.println("Enter key element:");
    int key = sc.nextInt();

    SearchElement obj = new SearchElement();
     obj.searchArrayElement(arr,key);
  }
}
