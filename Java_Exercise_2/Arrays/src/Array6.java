import java.util.Scanner;

public class Array6 {
	
	int duplicate(int[] arr) {
		int res = 0;
		int ans= 0;
		for(int i=0;i<arr.length;i++) {
			 ans = arr[i] ^ i;
		}
		for(int i=0;i<arr.length;i++) {
		 res = arr[i] ^ ans;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
        int size;
        size = sc.nextInt();
        
        int[] arr1 = new int[size];
        System.out.println("Enter array elements: ");
        
        for(int i=0;i<size;i++) {
      	  arr1[i] = sc.nextInt();
        }
        
        Array6 obj = new Array6();
        int res = obj.duplicate(arr1);
        System.out.println(res);

	}

}
