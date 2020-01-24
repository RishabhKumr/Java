class OperatorShifting
{
    public static void main(String args[])
    {
        byte x,y;
        x = 10;
        y = -10;
        System.out.println("Bitwise left shift: x << 2 =" +(x << 2));  //40
        System.out.println("Bitwise Right Shift: x >> 2" +(x >> 2)); 
        System.out.println("Bitwise Zero fill right shift: x >>> 2" +(x >>> 2));
        System.out.println("Bitwise zero fill right shift: y >>> 2" +(y>>>2));
    }
}