
public class Child extends Parent{
	
	Child(){
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
	 Parent p = new Parent();
	  Child c = new Child();
	   Parent p1 =  new Child();

	}

}
