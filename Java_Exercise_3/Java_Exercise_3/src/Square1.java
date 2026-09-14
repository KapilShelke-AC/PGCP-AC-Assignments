
public class Square1 extends Rectangle1 {
  
	public void printSquare() {
		System.out.println("Square of Rectangle");
	}
	 public static void main(String[] args) {
		 Square1 s = new Square1();
		 Rectangle1 r = new Square1();
		 
		 s.printShape();
		 s.printRectangle();
		 s.printSquare();
		 //s.printCircle();
		 
		 
		 
	 }
}
