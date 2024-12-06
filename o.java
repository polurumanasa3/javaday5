import java.util.*;
class o
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
 for(int i=0;i<n;i++)
 {
    for(int j=0;j<n;j++)
    {
    if(i==0 || i==n-1 || i+j==n-1)
    System.out.print("*"+" ");
    else
    System.out.print(" "+" ");
 }
 System.out.println();
}
}
}  