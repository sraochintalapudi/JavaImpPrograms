
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try
     {
    	 System.out.println("This is try block");
    	 int result=5/0;
    	 System.out.println("Rest of code in try block");
     }
     catch(ArithmeticException ae)
     {
    	 System.out.println("This is catch block");
    	 System.out.println("Exception is caught: "+ae);
     }
     finally
     {
    	 System.out.println("This is finally block");
     }
	}

}
