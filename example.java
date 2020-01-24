import java.util.Scanner;
public class example
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int num;
int countpos=0;
int countneg=0;
int countnull=0;
char ch;
do
{
System.out.println("Enter the number to be entered");
num = obj.nextInt();
if(num > 0)
{
countpos++;
}
else if(num < 0)
{
countneg++;
}
else
{
countnull++;
}
System.out.println("Do you wish to continue:?");
ch = obj.next().charAt(0);
}
while(ch == 'y' || ch == 'Y');
System.out.println("POSITIVE"+countpos);
System.out.println("NEGATIVE"+countneg);
System.out.println("NULL"+countnull);
}
}

