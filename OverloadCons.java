/* Here, Box defines three constructors to initialize the dimensions of a box various ways.
*/
class Box 
{
	double width;      //Data Members
	double height;
	double depth;
// constructor used when all dimensions specified
	Box(double w, double h, double d)				//param constructor
		{
		width = w;//10
		height = h;//15
		depth = d;//20
		}
// constructor used when no dimensions specified
	Box()																	//Default Constructor
		{
		width = -1; // use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // box
		}
// constructor used when cube is created
	Box(double len)												//Parameterized
	{
	width = height = depth = len;
	}
// compute and return volume
	double volume()                               //Method
	{
	return width * height * depth;
	}
}
class OverloadCons                                //Main Class Name
	{
	public static void main(String args[]) 
		{
// create boxes using the various constructors
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		double vol;
// get volume of first box
		vol = mybox1.volume();       //To Invoke Method
		System.out.println("Volume of mybox1 is " + vol);  //3K
// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);  //-1
// get volume of cube
		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol); //49*7
	}
}