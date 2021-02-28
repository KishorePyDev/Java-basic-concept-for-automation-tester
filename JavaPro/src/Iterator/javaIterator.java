package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class javaIterator 
{

	public void iteratorArrayList()
	{
		
		List<String> arrlist = new ArrayList<String>();
		
		// add value to arrayList
		arrlist.add("Dummy");
		arrlist.add("Value");
		arrlist.add("reference");
		
		
		Iterator<String> iter = arrlist.iterator();
		
		//System.out.println("First element is "+iter.next());
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

		
	}
	
	public static void main(String[] args) 
	{
		javaIterator ji = new javaIterator();
		ji.iteratorArrayList();
	}
	
}
