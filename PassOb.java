// Objects may be passed to methods.
class Test 
{
int a, b;
Test(int i, int j)
{
a = i;  
b = j;
}
// return true if o is equal to the invoking object
boolean equals(Test o)  //Test ob3
{
if(o.a == a && o.b == b)    //ob3.a==ob1.a &&  ob3.b==ob1.b
	return true;                       //-1==100 &&  -1==22
else 
	return false;
}
}
class PassOb
{
public static void main(String args[]) 
{
Test ob1 = new Test(100, 22);
Test ob2 = new Test(100, 22);
Test ob3 = new Test(-1, -1);
System.out.println("ob1 == ob2: " + ob1.equals(ob2));
System.out.println("ob1 == ob3: " + ob1.equals(ob3));
}
}