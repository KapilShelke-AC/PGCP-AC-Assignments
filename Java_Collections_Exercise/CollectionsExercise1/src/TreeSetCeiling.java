import java.util.TreeSet;

public class TreeSetCeiling {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println("Numbers: " + numbers);
		//Find element greater than or equal to given number
		
		Integer result = numbers.ceiling(25);
		System.out.println("Ceiling of 25: " + result);

	}

}
