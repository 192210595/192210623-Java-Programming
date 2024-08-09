import java.util.Scanner;
public class matrixsum
{
public static void main(String args[])
{
int i,j;
Scanner p=new Scanner(System.in);
System.out.println("Enter Matrix A ");
int a[][]=new int[2][2];
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=p.nextInt();
}
}
Scanner r=new Scanner(System.in);
System.out.println("Enter Matrix B ");
int b[][]=new int[2][2];
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
b[i][j]=r.nextInt();
}
}
int c[][]={{0,0},{0,0}};
System.out.println("Matrix Difference");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c[i][j]+=a[i][j]-b[i][j];
}
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}
}
