import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner  in = new Scanner(System.in);
         int n1 = in.nextInt();
         int n2 = in.nextInt();         
         int n3 = in.nextInt(); 
     int res = greatest_number(n1 , n2);
       int res1 = greatest_number(res , n3);
       System.out.println(res1);
         }
  public static int greatest_number(int a , int b)
  {
    if(a>b)
      return a;
    else
      return b;
}
}