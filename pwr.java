import java.util.Scanner;
public class pwr
{
    public static void main(String args[])
    {   int ans=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        for(int i=1;i<=num2;i++)
        {
            ans*=num1;
        }
        System.out.println(ans);

    }
}