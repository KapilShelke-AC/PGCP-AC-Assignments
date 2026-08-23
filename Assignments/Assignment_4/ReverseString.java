import java.util.Scanner;
 
class CountString{

  int countVowels(String str){
       int n = str.length;
       int count = 0;

       for(int i=0;i<n;i++){
         if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i'
           || str[i] == 'o' || str[i] == 'u'){
            
             count++;
          }
        }
           return count;
  }

  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     String s;
     System.out.println("Enter a String:");
   
     s = sc.next();
     
    CountString obj = new CountString();
       int res = obj.countVowels(str);

     System.out.println("Vowels are: " + res);
     
 }
