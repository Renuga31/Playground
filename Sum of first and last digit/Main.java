import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int num =  in.nextInt();
     int last = num % 10;    
      int temp = num;
        int count = 0;
      while (temp > 0 )
      { 
        temp = temp /10;
        count =  count + 1;
      }
      int i = 1;
      while( i < count)
      {
        num = num/10;
        i= i+1;
      }
      int first = num;
      int sum = first+last;
      System.out.println(sum);
        
      
	}
}