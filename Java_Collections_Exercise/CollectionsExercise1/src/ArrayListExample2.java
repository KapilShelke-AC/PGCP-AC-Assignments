import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		
		System.out.println("Before sorting: " + colors);
		
		//sort ArrayList
		Collections.sort(colors);
		System.out.println("After sorting: " + colors);
		
		//Copy one array into another
		ArrayList<String> colors2 = new ArrayList<>();
		colors2.add("");
		colors2.add("");
		colors2.add("");
		colors2.add("");
		
		System.out.println("Before Copying: " );
		System.out.println("Colors: " + colors);
		System.out.println("Colors1: " + colors2);
		
		Collections.copy(colors2, colors);
		
		System.out.println();
		System.out.println("After Copying: ");
		System.out.println("Colors: " + colors);
		System.out.println("Colors2: " + colors2);
		
		//Alternate way to copy array elements
		System.out.println("Copying elements by contructor method: ");
		ArrayList<String> colors3 = new ArrayList<>(colors);
		Collections.copy(colors3,colors);
		System.out.println(colors3);
		

	}

}
