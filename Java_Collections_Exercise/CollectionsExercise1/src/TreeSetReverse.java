import java.util.TreeSet;

public class TreeSetReverse {

	public static void main(String[] args) {
	   TreeSet<String> colors = new TreeSet<>();
	   
	   colors.add("Red");
	   colors.add("Yellow");
	   colors.add("Orange");
	   colors.add("White");
	   
	   System.out.println("Normal order: " + colors);
	   
	   System.out.println("Reverse order: " +  colors.descendingSet());
	   

	}

}
