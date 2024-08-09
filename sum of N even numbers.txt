import java.io.*;
import java.util.*;
class sumw
{
public static void main(String args[])
{
int a,sum=0,i=2;
Scanner s=new Scanner(System.in);
System.out.println("enter no of terms");
a=s.nextInt();
while(a>0)
{
sum=sum+i;
i=i+2;
a--;
}
System.out.println("sum of first "+a+" natural numbers="+sum);
}
}
