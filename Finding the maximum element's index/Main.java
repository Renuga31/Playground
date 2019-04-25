import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    
    Scanner in = new Scanner(System.in);
    int len=in.nextInt();
    int arr[]=new int[len];
    int mind=0;
    for(int ind=0;ind<len;ind++)
    {
      arr[ind]=in.nextInt();
       }
    int max=arr[0];
    for(int ind=0;ind<len;ind++)
    {
    if(max<arr[ind]){
      max=arr[ind];
      mind=ind;
     }
}
    System.out.println(mind);
  }
}
