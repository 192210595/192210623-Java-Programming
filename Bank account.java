import java.util.Scanner;
class solution
{
int no,a1,a2,d,w;
void getdata()
{
Scanner p=new Scanner(System.in);
System.out.println("Enter the Customer no");
no=p.nextInt();
Scanner q=new Scanner(System.in);
System.out.println("Enter the Initial Amount");
a1=q.nextInt();
a2=a1;
}
void deposit()
{
Scanner r=new Scanner(System.in);
System.out.println("Enter the Amount to be deposited");
d=r.nextInt();
a2=a2+d;
System.out.println("Deposited Successfully");
}
void withdrawl()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Amount to be Withdrawed");
w=s.nextInt();
if(w>a2)
{System.out.println("Insufficient Balance");}
else
{a2=w-a2;
System.out.println("Withdrawl Successfull");}
}
void balance()
{
System.out.println("Balance :"+a2);
}
}
class bankaccount
{
public static void main(String args[])
{
solution a=new solution();
a.getdata();
a.deposit();
a.withdrawl();
a.balance();
}
}
