import java.util.Scanner;
class solution
{
int reg,m1,m2,m3,m4,m5,t;
String n;
double avg=0.00f;
void getdata()
{
Scanner p=new Scanner(System.in);
System.out.println("Enter the name");
n=p.nextLine();
Scanner q=new Scanner(System.in);
System.out.println("Enter the Reg no");
reg=q.nextInt();
Scanner r=new Scanner(System.in);
System.out.println("Enter the Subject marks");
m1=r.nextInt();
m2=r.nextInt();
m3=r.nextInt();
m4=r.nextInt();
m5=r.nextInt();
}
void calculations()
{
t=m1+m2+m3+m4+m5;
avg=t/5;
}
void display()
{
if(m1>100||m2>100||m3>100||m4>100||m5>100)
{
System.out.println("Marks should not exceed 100");
}
else if(m1<50||m2<50||m3<50||m4<50||m5<50)
{
System.out.println("Student Name : "+n);
System.out.println("Reg No : "+reg);
System.out.println("Marks should be more than 50 inorder to pass");
System.out.println("Grade : F");
}
else
{
System.out.println("Student Name : "+n);
System.out.println("Reg No : "+reg);
System.out.println("Total Marks : "+t);
System.out.println("Average Marks : "+avg);
if(avg>=90)
{System.out.println("A+");}
else if(avg>=80&&avg<90)
{System.out.println("A");}
else if(avg>=70&&avg<80)
{System.out.println("B");}
else if(avg>=60&&avg<70)
{System.out.println("C");}
else
{System.out.println("D");}
}
}
}
class stdresults
{
public static void main(String args[])
{
solution a=new solution();
a.getdata();
a.calculations();
a.display();
}
}
