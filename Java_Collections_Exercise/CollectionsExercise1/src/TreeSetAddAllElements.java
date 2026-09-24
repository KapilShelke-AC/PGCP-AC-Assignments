import java.util.TreeSet;

public class TreeSetAddAllElements {

	public static void main(String[] args) {
		TreeSet<String> colors1 = new TreeSet<>();
		colors1.add("Orange");
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Purple");
		
		TreeSet<String> colors2 = new TreeSet<>();
		colors2.add("Voilet");
		colors2.add("Black");
		
		colors2.addAll(colors1);
		
		System.out.println("After adding colors2: " + colors2);

	}

}
