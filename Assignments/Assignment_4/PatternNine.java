class ReverseString{

  void reverseString(arr[] String){
     int start = 0;
     int end = 0;
     
     while(start < end){
       swap(arr[start],arr[end]);
        start++;
        end--;
     }
 }
  
public static void main(String[] args){

  Scanner sc = new Scanner(System.in);

   arr[] String = new String[5];

  System.out.println("Enter 5 strings:");
  
  for(int i=0;i<5;i++){
     arr[i] = sc.next();
  }
  
  ReverseString obj = new ReverseString();
       int result = obj.reverseString(arr);
   
     System.out.println("Reverse string:");
  }
}
   