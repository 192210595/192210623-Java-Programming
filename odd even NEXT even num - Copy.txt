import java.io.*;
import java.util.*;
class evenorodd
{
public static void main(String args[])
{
int num;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number=");
num=s.nextInt();
if(num % 2 == 0)
{
System.out.println(num+ " is a even number");
}
else
{
System.out.println(num+ " is a odd number");
int ly=num+1;
System.out.println(ly+ " is a next even number");
}
}
}
