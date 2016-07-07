import java.io.*;
import java.util.*;
import java.lang.*;
public class Holiday
{
public static void main(Strin [] args)
{
String s=new String();
String s1=new String("Monday");
String s2=new String("Tuesday");
String s3=new String("Wednesday");
String s4=new String("Thursday");
String s5=new String("Friday");
String s6=new String("Saturday");
System.out.println("Enter the day");
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
if((s.equals(s1))||(s.equals(s2))||(s.equals(s3))||(s.equals(s4))||(s.equals(s5))||(s.equals(s6)))
{
System.out.println("True");
}
else
{
Stystem.out.println("False");
}
}
}
