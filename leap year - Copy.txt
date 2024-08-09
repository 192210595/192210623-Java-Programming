import java.io.*;
import java.util.*;
class leapyear
{
public static void main(String args[])
{
int year;
Scanner s=new Scanner(System.in);
System.out.println("Enter year=");
year=s.nextInt();
if(year % 4 == 0)
{
System.out.println(year+ " is a leap year");
}
else
{
int w=year%4;
int ly=year+(4-w);
System.out.println(ly+ " is a next leap year");
}
}
}
