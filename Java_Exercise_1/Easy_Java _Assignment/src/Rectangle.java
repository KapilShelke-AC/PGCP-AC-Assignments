
public class Rectangle {
	
	int length;
	int breadth;
	
	Rectangle(int len, int bre){
		System.out.println("Constructor Called");
		length = len;
		breadth = bre;
	}
	
	int calculateArea() {
		return length * breadth;
	}

	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle(4,5);
		Rectangle obj2 = new Rectangle(5,8);
		
		System.out.println("Area of rectangle1: " + obj1.calculateArea());
		System.out.println("Area of rectangle2: " + obj2.calculateArea());
		
		

	}

}
