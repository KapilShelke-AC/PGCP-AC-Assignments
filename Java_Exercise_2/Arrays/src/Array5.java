import java.util.Scanner;

public class Array5 {
	
	void reverse(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
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
	         Array5 obj = new Array5();
	         
	          obj.reverse(arr);

	}

}
