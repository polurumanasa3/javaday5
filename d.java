import java.util.*;
class d
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int dig=n%10;
            rev=rev*10+dig;
            n/=10;
        }
        System.out.println(rev);
    }
}


        
