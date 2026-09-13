import java.util.Scanner;
public class Array4 {
	
	static int maxElem(int[] arr){
		
		int maxi = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > maxi) {
				maxi = arr[i];
			}
		}
		
		return maxi;
	}

     static int minElem(int[] arr) {
    	 int mini = arr[0];
    	 
    	 for(int i=1;i<arr.length;i++) {
 			if(arr[i] < mini) {
 				mini = arr[i];
 			}
 		}
 		
 		return mini;
    	 
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
        
        int res1 = maxElem(arr1);
        int res2 = minElem(arr1);
       
        System.out.println(res1);
        System.out.println(res2);
        

	}

}
