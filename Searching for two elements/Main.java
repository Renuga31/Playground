import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int ind;
        int len = in.nextInt();
      int elem[]=new int[len];
      for( ind=0;ind<len;ind++)
      {
        elem[ind]=in.nextInt();
    }
      int flag=0;
     int search_elem_1 =in.nextInt();
     int search_elem_2 =in.nextInt(); 
      for( ind=0;ind<len;ind++)
      {
        if(elem[ind]==search_elem_1)
        {
          flag=1;
          break;
        }}
        if(flag==1)
        {
          System.out.println(ind);
         
    }
        else
          System.out.println("-1");
      flag=0;
      for( ind=0;ind<len;ind++)
        {    
          
        if(elem[ind]==search_elem_2)
        {
          flag=1;
          break;
        }}
        if(flag==1)
        {
          System.out.println(ind);
         
    }
        else
          System.out.println("-1");
      
      }
    
        
}