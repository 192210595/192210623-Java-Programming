import java.io.*;
import java.util.*;
class tax
{
public static void main(String args[])
{
double sal,ai,tax;
Scanner s=new Scanner(System.in);
System.out.println("enter salary");
sal=s.nextFloat();
ai=sal*12;
System.out.println("annual income"+ai);
if(ai<250000)
{
System.out.println("no tax");
}
else if(ai>=250000 && ai<500000)
{
tax=ai*0.05;
System.out.println("tax is"+tax);
}
else if(ai>=500000 && ai<750000)
{
tax=ai*0.10;
System.out.println("tax is"+tax);
}
else if(ai>=750000 && ai<1000000)
{
tax=ai*0.15;
System.out.println("tax is"+tax);
}
else if(ai>=1000000)
{
tax=ai*0.20;
System.out.println("tax is"+tax);
}
}
}
