import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,sum=0.0000;
        a=sc.nextDouble();
        b=sc.nextDouble();
        sum=(a+b)/2;
        System.out.format("%.4f",sum);
    }
}