class shadowing
{
int count = 9;
public void login()
{
int count=10;
System.out.println("local variable count is"+count);
}
public void count()
{
System.out.println("instance variable count is:-"+count);
}
public static void main(String args[])
{
new shadowing.login();
new shadowing.count();
}
}
