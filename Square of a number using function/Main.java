import java.util.Scanner;
class Main
{  
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
         int n=in. nextInt();
      int answer = square_of_number(n);
      System.out.println(answer);
      
	}	
  public static int square_of_number(int num)
  {
    int square = num*num;
    return square;
}
}