import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<String> ll=new LinkedList<String>();
     ll.add("Subhash");
     ll.add("chandu");
     ll.add("nihal");
     Iterator <String> itr=ll.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
	}

}
