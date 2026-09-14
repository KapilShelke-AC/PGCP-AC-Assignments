import java.util.Arrays;
import java.util.Scanner;
public class Array7 {
	
	public void findCommonElem(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int i=0;
		int j = 0;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	
		
		while(i<n && j<m) {
			if(arr1[i] == arr2[j] && i<n && j<m) {
				 System.out.println(arr1[i]);
				 i++;
				 j++;
			}
			else if(arr1[i] > arr2[j] && i<n && j<m) {
				j++;
			}
			else {
				i++;
			}
		}
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array1 size: ");
		int size1 = sc.nextInt();
		
		System.out.print("Enter Array2 size: ");
		int size2 = sc.nextInt();
		
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		
		System.out.println();
		
		System.out.println("Enter Array1 elements: ");
		for(int i=0;i<size1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter Array2 elements: ");
		for(int i=0;i<size2;i++) {
			arr2[i] = sc.nextInt();
		}
		
		Array7 obj = new Array7();
		obj.findCommonElem(arr1, arr2);
	     

	}

}
