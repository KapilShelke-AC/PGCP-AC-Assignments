
public class Square extends Rectangle {
	private int side;
	
	Square(int length,int breadth,int side){
		super(length, breadth);
		this.side = side;
	}
	
	public void printAreaofSquare() {
			System.out.println("Perimeter of Square is :" + side*side);
	}
	
	public void printPerimeterOfSquare() {
		System.out.println("Perimeter of Square is: " + 4*(side*side));
	}

	public static void main(String[] args) {
		Square s = new Square(10, 20, 30);
		Rectangle r = new Square(10,20,30);
	
		
		s.printAreaOfRectangle();
		s.printPerimeterOfRectangle();
		
		s.printAreaofSquare();
		s.printPerimeterOfSquare();
		
		r.printAreaOfRectangle();
		r.printPerimeterOfRectangle();
		
		

	}

}
