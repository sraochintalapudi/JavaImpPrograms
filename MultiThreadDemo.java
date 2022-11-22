//java program to demonstrate multithreading by extending Thread class
class MultiThread extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Thread "+Thread.currentThread().getId()+" is Running");
		}
		catch(Exception e)
		{
			System.out.println("Exception is caught");
		}
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=8; //number of threads
     for(int i=0;i<n;i++)
     {
    	MultiThread mt=new MultiThread();
    	mt.start();
     }
	}

}
