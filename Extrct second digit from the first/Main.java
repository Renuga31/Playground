import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int num =  in.nextInt();    
      int temp = num;
        int count = 0;
      while (temp > 0 )
      { 
        temp = temp /10;
        count =  count + 1;
      }
      int a = count - 2;
      int i = 0;
      while( i < a)
      {
        num = num/10;
        i= i+1;
      }
     int n = num%10;
      System.out.println(n);
        
      
	}
}