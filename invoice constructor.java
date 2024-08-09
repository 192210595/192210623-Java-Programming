import java.util.Scanner;
class invoiceconstructor
{
int i,total=0;
invoiceconstructor()
{
int sno[]=new int[5];
String pname[]=new String[5];
int price[]=new int[5];
int qty[]=new int[5];
int amount[]=new int[5];
for(i=0;i<5;i++)
{
Scanner s2=new Scanner(System.in);
System.out.println("Enter the SNO "+(i+1));
sno[i]=s2.nextInt();
}
for(i=0;i<5;i++)
{
Scanner s3=new Scanner(System.in);
System.out.println("Enter the Name"+(i+1));
pname[i]=s3.next();
}
for(i=0;i<5;i++)
{
Scanner s4=new Scanner(System.in);
System.out.println("Enter the Price"+(i+1));
price[i]=s4.nextInt();
}
for(i=0;i<5;i++)
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter the Qty for P"+(i+1));
qty[i]=s1.nextInt();
}
for(i=0;i<5;i++)
{
amount[i]=qty[i]*price[i];
total+=amount[i];
}
}
void display()
{
System.out.println("S.NO NAME PRICE QTY AMOUNT");
for(i=0;i<5;i++)
{
System.out.println(sno[i]+"\t\t"+pname[i]+"\t\t"+price[i]+\t\t+qty[i]+\t\t+amount[i]);
}
System.out.println("Total Amount : "+total);
}
public static void main(String args[])
{
invoiceconstructor c=new invoiceconstructor();
c.display();
}
}
