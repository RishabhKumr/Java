abstract class inter
{
public void print()
{
System.out.println("Yes");
}
abstract void printline();
}
class abs extends inter
{
void printline()
{
System.out.println("No");
}
public static void main(String args[])
{
abs obj = new abs();
obj.print();
obj.printline();
}
}
