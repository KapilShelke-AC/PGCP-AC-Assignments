import java.util.Scanner;

public class Array3 {
	
	static int[] copiedArray(int[] original) {
		int[] copied = new int[original.length];
		
		for(int i=0;i<original.length;i++) {
			copied[i] = original[i];
		}
		return copied;
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
          int size;
          size = sc.nextInt();
          
          int[] original = new int[size];
          System.out.println("Enter array elements: ");
          
          for(int i=0;i<size;i++) {
        	  original[i] = sc.nextInt();
          }
          
          int[] copied = copiedArray(original);
          
          for(int i=0;i<original.length;i++) {
        	  System.out.print(copied[i] + " ");
          }


	}

}
