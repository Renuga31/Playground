import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    
      for(int row=1; row<= n ; row++)
      {
        for(int col=1; col<=n;col++)
        {
          if(row%2 == 0)
          {
              System.out.print(row+1);
            for(col=2;col<=n;col++)
            {
               System.out.print(row);
          }
          }
            else 
            {
               for(col=1;col<=n-1;col++)
            {
               System.out.print(row);
               }
              System.out.print(row+1);
            }
        }
	 System.out.print("\n");
}
    }
}
	