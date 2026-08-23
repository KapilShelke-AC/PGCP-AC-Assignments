import java.util.Scanner;
 
class CheckPalindrome{

  int palindrome(String str){
       int n = str.length();

       int start = 0;
       int end = n-1;
       
       while(start < end){
         if(str.charAt(start) != str.charAt(end)){
            return 0;
         }
         else{
           start++;
           end--;
       }
     }
       return 1;
  }

  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     String s;
     System.out.println("Enter a String:");
   
     s = sc.next();
     
    CheckPalindrome obj = new CheckPalindrome();
       int res = obj.palindrome(s);

       System.out.println("String is:" + res);

   }
 }
