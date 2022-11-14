package first;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

public class SpiltIterator {

	public static <T> Spliterator<T> getSpilteratorFormIterator(Iterator<T> iterator)
	{	
		return Spliterators.spliteratorUnknownSize(iterator, 0);
	}
	
	public static void main(String args[])
	{
		Iterator<Integer> iterator = Arrays.asList(1,2,3,4,5).iterator();
		
		Spliterator<Integer> si = getSpilteratorFormIterator(iterator);
		
		si.forEachRemaining(System.out::println);
		
	}
	
	
	
}
