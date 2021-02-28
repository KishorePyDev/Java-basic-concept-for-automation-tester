package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;



 /**
 * @author: Kishore Kumar 
 * @Topic : Collection 
 */

public class javaCollection
{
	
	// Array List in list 
	public void arrayList()
	{
		
		//using generic for String
		List<String> arrlist = new ArrayList<String>();
		
		// add value to arrayList
		arrlist.add("Dummy");
		arrlist.add("Value");
		arrlist.add("reference");
		
		System.out.println("Display the arrayList \n"+arrlist);
		
		// get value index
		System.out.println("Get value By Index 1 in arrayList \n"+arrlist.get(1));
		
		// Display the arrayList
		System.out.println("Display before remove element in arrayList \n"+arrlist);
		
		//remove element by index
		arrlist.remove(0);
		
		// Display the arrayList
		System.out.println("Display after remove the element in arrayList \n"+arrlist);
		
		// raw values accept any datatype because
		// we didn't use generic<>
		List list = new ArrayList();
		list.add("Kishore");
		list.add("Kumar");
		list.add("QA");
		list.add("Cognizant");
		list.add(1);
		
		System.out.println("Display arraylist without generic \n"+list);
		
	}
	
	// TreeSet in Set
	public void treeSet()
	{
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(2);
		set.add(11);
		System.out.println(set);

	}
	
	
	public static void main(String[] args) 
	{

		javaCollection jc = new javaCollection();
		//jc.arrayList();
		jc.treeSet();
	}
}
