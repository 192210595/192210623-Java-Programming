import java.io.*;
import java.util.*;
class pattern
{
public static void main(String args[])
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.println("enter a number=");
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println("\n");
}
}
}
