import java.util.Scanner;
interface post
{
public int value(int a,int b);
public void sample();
}
public class  GetVal implements post
{
int sum;
public int  value(int a,int b)
{
sum = a+b;
return sum;
}
public void sample()
{
System.out.println("get the post value");
}
public static void main(String args[])
{
GetVal getobj = new GetVal();

Scanner obj = new Scanner(System.in);
System.out.println("Enter the first Number:-");
int a = obj.nextInt();
System.out.println("Enter the second Number:-");
int b = obj.nextInt();
int ans = getobj.value(a,b);
System.out.println("Sum is:-"+ans);
getobj.sample();

}}
