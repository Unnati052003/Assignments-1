import java.util.*;
public class index
{
    public static void main(String args[])
    {
        int a=0,b=1,c;
        System.out.print("Enter term : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}