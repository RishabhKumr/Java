import java.util.Scanner;
abstract class Addit
{
abstract int getVal();
}
 class ab extends Addit
{
int sum;
int getVal(int a, int b)
{
sum = a + b;
return sum;
}
public static void main(String args[])
{
ab obj = new ab();
Scanner scn = new Scanner(System.in);
int a = scn.nextInt();
int b = scn.nextInt();
int sum = obj.getVal(a,b);
System.out.println(sum);
}
}
