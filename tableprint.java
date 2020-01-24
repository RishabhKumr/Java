import java.util.Scanner;
class OperatorShifting
{
    public static void main(String args[])
    {   int var;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to print the table:-");
        int num = input.nextInt();
        for(int i=1;i<=10;i++)
        {
        var = num * i;
        System.out.println(num+"*"+i+"="+var);
    }
}
}