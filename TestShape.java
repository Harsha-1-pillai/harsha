import java.io.*;
import java.util.*;
class shapes
{
void perimeter(int l,int b,int a)
{
int p=0,s=0;
System.out.println("enter the length");
Scanner sc=new Scanner(System.in);
l=sc.nextInt();
System.out.println("enter the breadth");
Scanner sca=new Scanner(System.in);
b=sca.nextInt();
p=2*(l+b);
System.out.println("Perimeter of rectangle : "+p);
System.out.println("enter the side");
Scanner scan=new Scanner(System.in);
a=scan.nextInt();
s=4*a;
System.out.println("Perimeter of square : "+s);
}
void perimeter(double r)
{
double c=0;
System.out.println("enter the radius");
Scanner s=new Scanner(System.in);
r=s.nextInt();
c=2*3.14*r;
System.out.println("Circumference of circle : "+c);
}
}
public class TestShape
{
public static void main(String arg[])
{
shapes ob=new shapes();
ob.perimeter(2,4,2);
ob.perimeter(5);
}
}
