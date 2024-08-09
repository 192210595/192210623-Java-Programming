import java.util.Scanner;
public class Reverseloop{
public static void main(String[] args){
String name,i,empty,len;
Scanner input=new Scanner(System.in);
System.out.println("enter a string:");
name=input.nextLine();
empty="";
len=name.length();
for(i=len-1;i>=0;i--){
empty=empty+name.charAt(i);
}
Sytem.out.println(+empty);
}}