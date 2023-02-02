import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        int a,b,c,T;
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
         for(int i=0;i<T;i++)
        {
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>b+c)||(b>c+a)||(c>a+b))
        {
            System.out.println("YES");
        }
        else
        {
         System.out.println("NO");   
        }
    }
    }
}