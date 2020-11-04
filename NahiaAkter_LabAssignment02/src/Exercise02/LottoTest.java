package Exercise02;

import java.util.Scanner;

public class LottoTest 
	{
		public static void main(String[] args) 
		{
			//invoking method for taking user input
			int userNumber = userInput();
			int lottoNumber=0;
			
			System.out.println("Your number must match the system generated number within 5 chanches");
			System.out.println("Running the lotto machine...");
			
			int counter = 1;
			while(userNumber != lottoNumber && counter <= 5) 
			{
				Lotto lotto = new Lotto();
				lottoNumber = lotto.getArray();
				
			if(userNumber == lottoNumber) 
			{
				System.out.println("Congratulations! You have won!");
				break;
			}
			else 
			{
				System.out.println("You've lost!");
			}
			counter++;
			}
		}
	
    //Taking user input
    private static int userInput() 
    {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter a number between 3 and 27: ");
      
      int userNumber  = scanner.nextInt();
      
      // close the scanner
         scanner.close();
     
      //validating user input 
  	  if(userNumber >= 3 && userNumber <= 27) 
  	  {
  		  return userNumber;
  	  }
  	  else 
  	  {
  		  while(userNumber < 3 || userNumber > 27) 
  		  {
  			System.out.print("Please enter a valid number: ");
  			
    		  userNumber = scanner.nextInt();
  		  }	 
  	      return userNumber;
  	  }
    } //end of userInput method
    
} //end of class
