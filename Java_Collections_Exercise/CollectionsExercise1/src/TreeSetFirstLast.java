import java.util.TreeSet;

public class TreeSetFirstLast {

	public static void main(String[] args) {
	TreeSet<String> colors = new TreeSet<>();
	colors.add("Orange");
	colors.add("White");
	colors.add("Black");
	
	//get First element
	String firstColor = colors.first();
	String lastColor = colors.last();
	
	System.out.println("Treeset colors: " + colors);
	System.out.println("First Element: " + firstColor);
    System.out.println("Last Element: " + lastColor);
	}

}
