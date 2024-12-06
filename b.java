import java.util.*;
class b
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int t=Sc.nextInt();
        for(int i=0;i<t;i++)
        
        {
            int n=Sc.nextInt();
            int rev=0;
            int temp=n;
            while(n>0)
            {
                int dig=n%10;
                rev=rev*10+dig;
                n/=10;
            }
            System.out.println(rev);
             if(temp==rev)System.out.println("polindrome");
            else System.out.println("not polindrome");
        }
    }

        }
    
