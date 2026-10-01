
public class FindMinMaxElement {
	static void minMaxElement(int[] a, int size) {
		int min = a[0];
		int max = a[0];
		
		for(int i=1;i<size;i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		for(int i=1;i<size;i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
	  System.out.println("Min element is: " + min);
	  System.out.println("Max element is: " + max);
	}

	public static void main(String[] args) {
		int[] arr = {20,34,2,6,76};
		int size = 5;
		
		minMaxElement(arr,size);
		 

	}

}
