import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Green");
		Collections.reverse(colors);
		
		System.out.println("Reverse: " + colors);

	}

}
