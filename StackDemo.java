import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack<String> s=new Stack<String>();
     s.push("Subhash");
     s.push("chandu");
     s.push("nihal");
     s.push("xyz");
     s.pop();
     Iterator <String> itr=s.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
	}

}
