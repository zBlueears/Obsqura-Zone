package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample 
{
	public static void main(String[] args)
	{
		List<String> l1=new ArrayList<String>();	
		l1.add("Geethanjali");
		l1.add("Andrea");
		l1.add("Lekshmi");
		l1.add("Sheetal");
		System.out.println(l1);
		System.out.println(l1.size());
		//l1.remove(1);
		System.out.println(l1);
		System.out.println(l1.size());
		ArrayList l2= new ArrayList<>();	//non generic: given without datatype
		l2.add(23);
		l2.add(l1);
		l2.add('f');
		l2.add("Obsqura");
		System.out.println(l2);
		System.out.println(l2.size());
		ArrayList<String> l3=new ArrayList<String>();	//generic: given with datatype
		l3.add("Java");
		l3.add("C++");
		l3.add("Python");
		l3.add("C");
		l3.add("C");
		l3.add(null);
		l2.remove(l1);
		System.out.println(l3);
		System.out.println(l3.size());
		System.out.println(l2);		
		l3.remove("C");
		System.out.println(l3);
		System.out.println("Size of l3 "+l3.size());
		System.out.println();
		Collections.sort(l1);
		System.out.println("Sorted list:"+l1);
		System.out.println("Get the 2 item in list 3 "+l3.get(2));
		l1.addAll(l2);
		System.out.println("Added elements of l2 to l1 :"+l1);
		l1.removeAll(l2);
		System.out.println("remove them all "+ l1);
		l3.set(2, "Java Developement");
		System.out.println(l3);
		System.out.println();
		for(int i=0;i<l2.size();i++)
		{
			System.out.println(l2.get(i));
		}
		System.out.println();
		for(String i: l1)
		{
			System.out.println(i);			
		}
		
		
	}

}
