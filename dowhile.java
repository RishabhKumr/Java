import java.lang.String;
import java.util.Scanner;
public class dowhile
{
public static void main(String args[])
{
Scanner console = new Scanner(System.in);
int number1, number2;
char choice;
do
{
System.out.println("Enter the first number");
number1 = console.nextInt();
System.out.println("Enter the second number");
number2 = console.nextInt();
int sum = number1+number2;
System.out.println("Sum of numbers:"+sum);
System.out.println("Do you want to continue?");
choice = console.next().charAt(0);
System.out.println();
}
while(choice == 'y' || choice == 'Y');
}
}

