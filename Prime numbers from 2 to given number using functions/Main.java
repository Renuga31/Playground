import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in =new Scanner(System.in);
          int num = in.nextInt();
      for(int i = 2; i<= num ; i++)
      {
        if((is_prime(i) == 0))
           {
             System.out.println(i);
	}
}
    }
  public static int is_prime (int n){
    int flag = 0;
    for(int iter= 2 ; iter< n ; iter++)
    {
      if(n% iter == 0)
      {
        flag =1;
        break;
      }
    }
      return flag;
  } 
} 