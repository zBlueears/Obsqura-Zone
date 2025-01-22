package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Example 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> b = new ArrayList<>();
		b.add(10);
		b.add(20);
		b.add(30);
		System.out.println(b);
		ArrayList<Float> c = new ArrayList<>();
		c.add(2.3f);
		c.add(2.4f);
		c.add(2.5f);
		System.out.println(c);
		for(int i: b)
		{
			System.out.println(i);
		}
		for(float f: c)
		{
			System.out.println(f);
		}
		Iterator <Integer> it= b.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(b);
		System.out.println(b.contains(40));
		System.out.println(b.isEmpty());
		ArrayList l1= new ArrayList<>();
		l1.add("For loop");
		l1.add("For each loop");
		l1.add("Iterator inteface for looping");
		
		Iterator <Integer> i= l1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
