
public class Rectangle {
  private float length;
  private float breadth;
  
   Rectangle(float len, float bre){
	  length = len;
	  breadth = bre;
  }
  
  public void printAreaOfRectangle() {
	  System.out.println("Area of Recatngle is :" + length*breadth);
  }
  
  public void printPerimeterOfRectangle() {
	  System.out.println("Perimeter of Rectangle is: " + 2 * (length + breadth));
  }
}
