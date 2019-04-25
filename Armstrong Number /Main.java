import java.util.*;
class Main{
	public static void main (String[] args){
	   // Type your code here
     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count =1;
      int i =0;
      int temp1 =n;
      int temp =n;
      while(temp >0)
      {
        temp = temp/n ;
        count= count+1; 
       }
      double sum =0;
      while(n > 0)
      {
        
       int rem = n% 10;
        double a = Math.pow(rem,count);
        sum = sum+a;
        n = n/10;
      }
      if(sum== temp1)
      {  
        System.out.println("Armstrong Number");
    }
      else
      { 
        System.out.println("Not a Armstrong Number");
    }
      
    }      
}