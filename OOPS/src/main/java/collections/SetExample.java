package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample
{
	public static void main(String[] args) 
	{
		Set<String> s1= new HashSet<String>() ;
		s1.add("red");
		s1.add("green");
		s1.add("yellow");
		HashSet s2=new HashSet();
		s2.add("blue");
		s2.add(10);
		s2.add('c');
		HashSet <String> h1=new HashSet<String>();
		h1.add("Carrot");
		h1.add("tomato");
		h1.add("onion");
		System.out.println("Size of set1 "+s1.size());
		s1.addAll(h1);
		for(String i: s1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Iterator it=s2.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		s1.removeAll(h1);
		for(String i: s1)
		{
			System.out.print(i+" ");
		}
		
		
	}

}

