/* Here, Box uses a constructor to initialize the dimensions of a box.*/
class Box 
{
double width;
double height;
double depth;
		Box(double width, double height, double depth) 
		{
		this.width = width;
		this.height = height;
		this.depth = depth;
		}
		
		double volume()
		{
		return width * height * depth;
		}
}
class thisKey 
{
	public static void main(String args[]) 
	{
	// declare, allocate, and initialize Box objects
	Box mybox1 = new Box(10,20,15);
	Box mybox2 = new Box(3,6,9);
	
	// get volume of first box
	double vol = mybox1.volume();
	System.out.println("Volume is " + vol);
	// get volume of second box
	vol = mybox2.volume();
	System.out.println("Volume is " + vol);
	}
}