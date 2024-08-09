public class gcd{
public static void main(String[] args){
int a=20,b=30,gcd=1,i,lcm;
for(i=1;i<=a&&i<=b;i++)
{
if(a%i==0 && b%i==0)
{
gcd=i;
}}
lcm=(a*b)/gcd;
System.out.println(+gcd);
System.out.println(+lcm);
}}