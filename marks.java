import java.util.Scanner;
public class marks{
public static void main(String[] args){
Scanner reader=new Scanner(System.in);
System.out.println("enter the marks in Subjects:");
int python=reader.nextInt();
int C=reader.nextInt();
int Maths=reader.nextInt();
int Physics=reader.nextInt();
int score,total;
float agg;
total=python+Maths+Physics+C;
agg=total/4;
System.out.println("Total="+total);
System.out.println("agg="+agg);
if(agg<=75){
System.out.println("First division");
}
else if(agg<=60){
System.out.println("Second division");
}
else if(agg<=50){
System.out.println("Third division");
}
else{
System.out.println("Fail");
}
}}