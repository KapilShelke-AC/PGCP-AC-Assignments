import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		
		colors.add(0, "Orange");
		
		//Retrieve element at specified index
		String color = colors.get(2);
		
		//Update Existing element
		colors.set(3,"Black");
		
		//remove element
		colors.remove(3);
		
		//Search an element
		if(colors.contains("Blue")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
		System.out.println("Colors: " + colors);
		System.out.println("Element at index 2: " + color);

	}

}
