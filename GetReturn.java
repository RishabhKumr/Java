import java.util.Scanner;
abstract class Addition
{
abstract int sum(int a,int b);
}
public class GetReturn extends Addition
{
int total;
int sum(int a,int b)
{
total = a+b;
return total;
}
public static void main(String args[])
{
Scanner getobj = new Scanner(System.in);
System.out.println("Enter the first Number:-");
int a = getobj.nextInt();
System.out.println("Enter the second Number:-");
int b = getobj.nextInt();
GetReturn obj = new GetReturn();
int ans  = obj.sum(a,b);
System.out.println("Sum:-"+ans);
}
}
