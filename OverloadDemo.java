class OverLoad
{
	void add()
	{
		int a=100,b=200;
		System.out.println(" No arguments");
		System.out.println("Addition is :"+(a+b));
	}
	void add(int a, int b)
	{
		System.out.println(" a is integer b is integer");
		System.out.println("Addition is :"+(a+b));
	}
	void add(double a, double b)
	{
		System.out.println(" a is double b is double");
		System.out.println("Addition is :"+(a+b));
	}
	double add(double a, int b)
	{
		System.out.println("a is double b is int return type is double");
		double c=a+b;
		return c;
	}
}
public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      OverLoad o=new OverLoad();
      o.add(10.5, 20.5);
      o.add();
      o.add(10, 20);
     double result=o.add(10.5,20);
     System.out.println("Result is :"+result);
      
	}

}
