import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
         int n=in. nextInt();
      int answer = sum_of_number(n);
      System.out.println(answer);
      
	}	
  public static int sum_of_number(int num)
  {
    int sum=0;
    for(int i = 1 ;i<= num ;i++)
       sum = sum +i;
    return sum;
}
}