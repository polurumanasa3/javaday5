import java.util.*;
class m  
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
 for(int i=1;i<=n;i++)
 {
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
 }
 for(int i=n-1;i>=1;i--)
 {
    for(int j=i;j>=1;j--)
    {
        System.out.print("*");
        }
        System.out.println();
 }
}
}


 


                              