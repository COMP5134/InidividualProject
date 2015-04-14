package encapsulation;
import java.util.*;

public class Main {
	
	public static void main(String args[])
	{
		SortingOperation operator1 = new SortingOperation();
		ArrayList<Integer> unsorted_numbers= new ArrayList<Integer>();
		
		for(int i=10; i>0; i--)
		{	
			unsorted_numbers.add(i);
			System.out.println(i+" added into ArrayList<Integer> unsorted_numbers");
		}
		
		ArrayList<Integer> sorted_numbers = operator1.sorting(unsorted_numbers);
		//As long as you feed an ArrayList into the sorting function, sorting function can return you a 
		//sorted ArrayList.
		//main function will not be affected even the internal implementation of sorting changed.
		
		for(int j=0; j<sorted_numbers.size(); j++)
		{
			System.out.println(sorted_numbers.get(j));
		}
	}

}
