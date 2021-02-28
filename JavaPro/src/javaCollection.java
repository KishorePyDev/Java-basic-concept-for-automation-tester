import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// collection 

// list  => ArrayList(Insterion order,allow duplicates)

// Set 


public class javaCollection 
{
	public static void main(String[] args) 
	{
		
		List list = new ArrayList();
		
		list.add("Kishore");
		list.add("Kumar");
		list.add("QA");
		list.add("Cognizant");
		list.add(1);
		System.out.println(list.get(3));
		
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}
}
