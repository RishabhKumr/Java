import java.util.Scanner;
public class example2
{
public static void main(String[] args)
{
int tempL=Integer.MIN_VALUE;
int tempS=Integer.MAX_VALUE;
char ch;
Scanner obj  = new Scanner(System.in);
int num;
do
{
System.out.println("Enter the number");
num = obj.nextInt();
if(num > tempL)
{
tempL = num;
}
if(num < tempS)
{
tempS = num;
}
System.out.println("Do you want to continue:?");
ch = obj.next().charAt(0);
}
while(ch == 'y'||ch == 'Y');
System.out.println("Larger:-"+tempL);
System.out.println("Smaller:-"+tempS);
}
}
