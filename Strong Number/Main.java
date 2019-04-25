import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum =0;
      int temp1=n;
      int temp=n;
      while(n>0)
      {
      int dig = n%10;
      int fact =1;
      for(int i = 1; i<= dig; i++)
      {
        fact = fact*i;
	}
      sum = sum+ fact;
      n = n/10;
      }
      if(sum==temp1)
      {
          System.out.println("Yes");
    }
      else 
      { 
        System.out.println("No");
      }
    }
}