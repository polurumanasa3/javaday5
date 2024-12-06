import java.util.*;
class e
{
public static void main(String args[])
{
 Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
 int c=0;
 while(n>0)
  {
 c+=n&1;
n>>=1;
 }
 System.out.println(c);
 }
 }