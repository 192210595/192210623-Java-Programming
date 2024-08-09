import java.util.Scanner;
public class Fibonacci
{
public static void main(String args[])
{
int a=0,b=1,c,sum=1;
Scanner f=new Scanner(System.in);
int n=f.nextInt();
System.out.println("Fibonacci Series : ");
System.out.println(a);
System.out.println(b);
for(int i=0;i<n-2;i++)
{
c=a+b;
a=b;
b=c;
System.out.println(c);
if(c%2==1)
{
sum+=c;
}
}
System.out.println("Sum of Odd nos : "+sum);
}
}
