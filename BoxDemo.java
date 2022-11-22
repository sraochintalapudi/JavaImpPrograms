class Box
{
	double width;
	double height;
	double depth;
	Box()
	{
		System.out.println("Constructor");
		width=2;
		height=2;
		depth=2;
		
	}
	void volume(double width, double height, double depth)
	{
		System.out.println("Method");
		System.out.println("Volume is "+width*height*depth);
	}
}
class BoxDemo {

	public static void main(String[] args) {
		Box b1=new Box();
		b1.volume(10,10,10);
	}

}
