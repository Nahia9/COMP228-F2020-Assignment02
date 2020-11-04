package Exercise02;

import java.security.SecureRandom;

public class Lotto 
{
	SecureRandom randomNumbers = new SecureRandom();
	   
	//declaring array instance variable
	private int [] array = new int [3];

	//populating array with random numbers
	 public void randomNumber(int [] array) 
	 {
	    for (int number = 0; number < 3; number++) 
	    {
	    	array [number] = 1 + randomNumbers.nextInt(9); // number from 1 to 9
	 	 }
	 } 
      
	 //constructor
	public Lotto() 
	{
		randomNumber(array);
	}	
	
	 public int getArray() 
	 {
		//method for sum of random integers
		 int sum = 0;
		 for(int i=0; i<array.length; i++) 
		 {
			 sum = sum + array[i];

		 }
		 return sum;
	}
}


