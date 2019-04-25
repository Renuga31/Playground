import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
        int len = in.nextInt();
      int elem[]=new int[len];
      for(int ind=0;ind<len;ind++)
      {
        elem[ind]=in.nextInt();
    }
      int max=elem[0];
      for( int ind=0;ind<len;ind++)
      {
        if(max< elem[ind])
          max=elem[ind];
        }
       System.out.println(max);
    }         
}