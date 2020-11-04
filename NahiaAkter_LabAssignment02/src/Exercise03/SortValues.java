package Exercise03;

public class SortValues 
{
	public static void Numbers(int... numbers ) 
	{
		int temporaryPosition;
		
		for (int i = 0; i < numbers.length; i++) 
        {
            for (int j = i + 1; j < numbers.length; j++) 
            {
                if (numbers[i] < numbers[j]) 
                {
                	temporaryPosition = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temporaryPosition;
                }
            }
        }
		
		for (int n : numbers) 
		{ 
		  System.out.printf(n+" ");
		}
	}//end method
} // end of class
