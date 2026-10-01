
public class MoveAllZerosToEnd {

	static void moveZeroToEnd(int[] a) {
		int position = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] != 0) {
				a[position] = a[i];
				position++;
			}
		}
		
		while(position < a.length) {
			a[position] = 0;
			position++;
		}
		
		
	}
	public static void main(String[] args) {
		int[] arr = {0,5,6,7,0,0,3};;
		moveZeroToEnd(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
