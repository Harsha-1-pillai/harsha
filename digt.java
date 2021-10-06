import java.io.*;
import java.util.*;
class dig
{
void calc(int num)
{
int r,s=0;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num>0)
{
r=num%10;
if(r%2==0)
{
s=s+r;
}
num=num/10;
}
System.out.println("Sum of even digits : "+s);
}
}
public class digt
{
public static void main(String arg[])
{
int num;
dig ob=new dig();
ob.calc(24);
}
}
