import java.util.Scanner;
public class factorial
{  
    public static void main(String[] args) {
        int fact=1;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while(num != 0)
        {
          fact*=num; 
           num--;
        }
        System.out.println(fact);
    }
}