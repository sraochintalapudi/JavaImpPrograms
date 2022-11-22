import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> al=new ArrayList<String>();
     al.add("Subhash");
     al.add("chandu");
     al.add("nihal");
     Iterator <String> itr=al.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
	}

}
