class add
{
int x,y,sum;                                                                            
add(int a,int b)
{
x=a;
y=b;
}
void display()
{
sum=x+y;
System.out.println("Sum : "+sum);
}
}
class sumparameterizedconstructor
{
public static void main(String args[])
{
add a=new add(10,15);
a.display();
add b=new add(24,27);
b.display();
}
}
