
import java.util.Scanner;

public class Array {
	void sortElement(int[] arr) {
	      int start = 0;
          int end = arr.length-1;
          
         for(int i=1;i<arr.length;i++) {
        	 for(int j=1;j<arr.length;j++) {
        		 if(arr[j-1] > arr[j] ) {
        			 int temp = arr[j-1];
        			 arr[j-1] = arr[j];
        			 arr[j] = temp;
        		 }
        	 }
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
          
          System.out.println("Array elements are: ");
          
          Array obj = new Array();
         
         obj.sortElement(arr);
         for(int i=0;i<arr.length;i++) {
        	 System.out.print(arr[i] + " ");
         }
          
    
	}
}
