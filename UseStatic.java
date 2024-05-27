/*Demonstrate static variables, methods, and blocks.
Static Variable
Static Block
Static Method
*/
class UseStatic
{
static int a = 3;
static int b;
static void meth(int x)           //Static 
{
System.out.println("x = " + x);
System.out.println("a = " + a);
System.out.println("b = " + b);
}
static 
{
System.out.println("Static block initialized.");
b = a * 4;
}
public static void main(String args[]) 
{
meth(42);
}
}