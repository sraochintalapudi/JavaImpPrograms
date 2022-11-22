//java program to demonstrate multithreading by implementing Runnable Interface
class MultiThread2 implements Runnable
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
public class MultiThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=8; //number of threads
     for(int i=0;i<n;i++)
     {
    	Thread t=new Thread(new MultiThread2());
    	t.start();
     }
	}

}
