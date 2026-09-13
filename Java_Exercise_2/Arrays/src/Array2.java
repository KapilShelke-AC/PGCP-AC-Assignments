import java.util.Scanner;

public class Array2 {

	void calculateAvg(int [] arr) {
		int sum = 0;
		int avg;
		for(int i=0;i<arr.length;i++) {
		  sum += arr[i];
		}
		avg = (sum /arr.length);
		System.out.println("Avg of array is:" + avg);
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
          
          Array2 obj = new Array2();
          
          obj.calculateAvg(arr);
         
          
	}

}
