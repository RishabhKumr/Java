import java.lang.*;

interface Animal
{
    public void animalSound();
    public void sleep();

}
class Cow implements Animal
{
public void animalSound()
{
    System.out.println("This is a cow sound");
}
public void sleep()
{
    System.out.println("zZZ");
}

    public static void main(String args[])
{
    Cow newcow = new Cow();
    newcow.animalSound();
    newcow.sleep();
}
}