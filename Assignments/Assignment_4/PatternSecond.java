class PatternThird{
 
  public static void main(String[] args){

    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;i=i+2){
        System.out.print(i);
     
       if(j < i){
          System.out.print("*");
       }
    }
      System.out.println();
   }
 }
}