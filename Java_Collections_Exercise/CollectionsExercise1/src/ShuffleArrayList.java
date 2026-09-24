import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
          colors.add("Red");
          colors.add("Green");
          colors.add("Yellow");
          colors.add("Bule");
          colors.add("Black");
          
          System.out.println("Before Shuffle: " +colors);
          Collections.shuffle(colors);
          System.out.println("After Shuffle: " + colors);
	}

}
