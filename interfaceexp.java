interface interfaceexp1
{
public int sum(int a,int b);
}
public class interfaceexp implements interfaceexp1
{
int total;
public int a=10;
public int b=67;
public int sum(int a, int b)
{
total = a+b;
return total;
}

public static void main(String args[])
{
interfaceexp obj = new interfaceexp();
int val = obj.sum(a,b);
System.out.println(val);
}
}
