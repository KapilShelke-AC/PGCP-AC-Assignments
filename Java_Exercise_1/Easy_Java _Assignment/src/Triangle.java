
public class Triangle {
   double sideOne;
   double sideTwo;
   double sideThree;
   
   Triangle(double side1, double side2, double side3){
	   System.out.println("Parameterized Constructor");
	   sideOne = side1;
	   sideTwo = side2;
	   sideThree = side3;
   }
   
   double calculateArea() {
	   return (sideOne+sideTwo+sideThree)/2;
   }
   
   double calculatePerimeter() {
	   return (sideOne + sideTwo + sideThree);
   }
   public static void main(String[] args) {
	   Triangle obj = new Triangle(3,4,5);
	   
	   System.out.println("Area of Triangle is: " +  obj.calculateArea());
	  
	   
	   System.out.println("Perimeter of Triangle is: " + obj.calculatePerimeter());
   }
   
}
