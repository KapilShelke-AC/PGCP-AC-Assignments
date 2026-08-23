import java.util.Scanner;

class AgeChecker{

  public static void checkAgeCategory(int num){
    if(num < 18){
      System.out.println("You are Minor:");
    }

    else if(num >= 18){
      System.out.println("You are Adult:");
   }
}

 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter age: ");
    int age = sc.nextInt();
   
    checkAgeCategory(age);
     sc.close();
 }
}



















