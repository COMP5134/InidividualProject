package encapsulation;
import java.util.*;

public class SortingOperation {
	
	public ArrayList sorting(ArrayList<Integer> numbers)
	{		
		//uncomment it when show encapsulation
		///*
		try {
		    //Thread.sleep(10000);
		} catch(Exception ex) {
		    Thread.currentThread().interrupt();
		}
		//*/
		
		//a O(n^2) sorting algorithm, bubble sort, is encapsulated in this function
		for(int i=0; i< numbers.size();i++)
		{
			for(int j=0; j< numbers.size()-1;j++)
			{
				if (numbers.get(j)> numbers.get(j+1))
				{
					Integer temp= numbers.get(j);
					numbers.set(j, numbers.get(j+1));
					numbers.set(j+1, temp);
				}
			}
		}
		return numbers;
	}
}
