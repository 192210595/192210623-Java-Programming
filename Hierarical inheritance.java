class parent
{
int x=30;
int y=3;
void display()
{
System.out.println("Parent has "+x+" crores");
System.out.println("Parent has "+y+" children");
}
}
class child1 extends parent
{
void display1()
{
System.out.println("Therefore the Child1 inherits "+(x/y)+" crores");
}
}
class child2 extends parent
{
void display2()
{
System.out.println("Therefore the Child2 inherits "+(x/y)+" crores");
}
}
class child3 extends parent
{
void display3()
{
System.out.println("Therefore the Child3 inherits "+(x/y)+" crores");
}
}
class heirachialinheritance
{
public static void main(String args[])
{
child1 c1=new child1();
child2 c2=new child2();
child3 c3=new child3();
c1.display();
c1.display1();
c2.display2();
c3.display3();
} 
}
