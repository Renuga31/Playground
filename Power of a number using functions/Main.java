import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in =new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      double answer = power_numbers(base , exp);
        System.out.println(answer);
    }
      public static double power_numbers( int b ,int x)
   {
     int pow;
     double ans  =Math. pow( b, x);
       return ans;
   }
}
