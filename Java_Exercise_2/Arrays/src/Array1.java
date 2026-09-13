import java.util.Scanner;

public class Array1 {
	
	  void twoSum(int[] arr) {
    	  if(arr.length < 2) {
    		 System.out.println("Enter minimum two elements");
    	  }
    	  else {
    		  int res = 0;
    		 for(int i=0;i<arr.length;i++) {
    			 res = res + arr[i];
    		 }
    		  System.out.println("Array sum is: " + res);
    	  }
      }


	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
          int size;
          size = sc.nextInt();
          
          int[] arr = new int[size];
          System.out.println("Enter array elements: ");
          
          for(int i=0;i<size;i++) {
        	  arr[i] = sc.nextInt();
          }
          
         Array1 obj = new Array1();
         obj.twoSum(arr);
          
        
	}

}
