import java.util.Scanner;
public class subtraction 
{
public static void main (String[]args)
{
Scanner nane= new Scanner (System.in);
float a,b,c,d,e,f,g,t,s;

System.out.println("please enter the first float value");
a=nane.nextFloat();

System.out.println("please enter the Second float value");
b=nane.nextFloat();

System.out.println("please enter the third float value");
c=nane.nextFloat();

System.out.println("please enter the fourth float value");
d=nane.nextFloat();

System.out.println("please enter the fifth float value");
e=nane.nextFloat();

f=e%c;
g=f*a;
t=g+d;
s=t-b;

System.out.println("the subtraction is "+s);
}
}