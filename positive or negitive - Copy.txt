import java.io.*;
import java.util.*;
class posandneg
{
public static void main(String args[])
{
int num;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number=");
num=s.nextInt();
if(num>0)
{
System.out.println(num+ " is a positive number");
}
else
{
System.out.println(num+ " is a negative number");
int ly=-1+num;
int k=-(ly);
System.out.println(k+ " left to get first positive integer number");
}
}
}
