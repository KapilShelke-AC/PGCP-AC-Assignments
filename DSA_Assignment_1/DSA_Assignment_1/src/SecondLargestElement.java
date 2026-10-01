
public class SecondLargestElement {

	static int secondLargest(int[] a, int size) {
		int firstLarge = a[0];
		int secondLarge = a[0];
		
		for(int i=1;i<size;i++) {
			if(a[i] > firstLarge) {
				secondLarge = firstLarge;
				firstLarge = a[i];
			}
			else if(a[i] > secondLarge && firstLarge != secondLarge ) {
				secondLarge = a[i];
			}
		}
		return secondLarge;
	}
	public static void main(String[] args) {
	int[] arr = {10,24,45,2,8};
	int size = 5;
	
	int res = secondLargest(arr,size);
	System.out.println(res);

	}

}
