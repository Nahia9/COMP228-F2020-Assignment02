package Exercise01;

import java.security.SecureRandom;
import java.util.Scanner;

//Class definition
//Class name is QuestionBank

 public class QuestionBank {
	
	int correctAnswer = 0;
	int wrongAnswer = 0 ;
	
 public void simulateQuestions() 
 {
 String [] question = {"1. Which of the following is not a valid Java identifier?\n"
	             + "(a)my Value\n(b)$_AAA1\n(c)$_AAA1\n(d)m_x\n",
	             
	             "2. Which of the following cannot cause a syntax error to be reported by the Java compiler?\n"
			     + "(a)Mismatched {}\n(b)Missing */ in a comment that begins with /*\n(c)Orange\n(d)An extra blank line.\n",
			     
	             "3. Each class you create becomes a new ________ that can be used to declare variables and create objects\n"
			     + "(a)package\n(b)instance\n(c)library\n(d)type.\n",
			     
	             "4. You can declare new classes as needed; this is one reason Java is known as a(n) ________ language\n"
			     +"(a)portable\n(b)incremental\n(c)extensible\n(d)virtual\n",
			     
	             "5. When a method terminates, the values of its local variables are ________\n"
			     +"(a)lost\n(b)restored\n(c)copied\n(d)saved.\n" 	            		 		
					};//end of question array
		
		int i=0;
		while(i<5) 
		{
			System.out.println(question[i]);
			i++;
		}
		
	inputAnswer(); //calling the method 
	
		System.out.println("\nNumber of Correct Answer: " + correctAnswer);
		System.out.println("\nNumber of Wrong Answer: " + wrongAnswer);	
		System.out.println("\nPercentage of correct answers: " + correctAnswer*100/5 + "%");
		
	}//end of simulate questions method
	
  public void checkAnswer(int qstn, char answer) 
  {
		if(qstn==1) 
		{
			if(answer=='a') 
			{
				generateMessage("right");
				correctAnswer++;
			}	
			else 
			{
				generateMessage("wrong");
				wrongAnswer++;
			}
		}
		else if(qstn==2) 
		{
			if(answer=='d') 
			{
				generateMessage("right");
				correctAnswer++;				
			}
			
			else {
				generateMessage("wrong");
				wrongAnswer++;
			}						
		}
		
		else if(qstn==3) 
		{
			if(answer=='d') 
			{
				generateMessage("right");
				correctAnswer++;				
			}
			
			else 
			{
				generateMessage("wrong");
				wrongAnswer++;
			}						
		}
		
		else if(qstn==4) 
		{
			if(answer=='c') 
			{
				generateMessage("right");
				correctAnswer++;				
			}
			
			else 
			{
				generateMessage("wrong");
				wrongAnswer++;
			}						
		}
		
		else if(qstn==5) 
		{
			if(answer=='a') 
			{
				generateMessage("right");
				correctAnswer++;				
			}
			else 
			{
				generateMessage("wrong");
				wrongAnswer++;
			}						
		}					
	}//end method
	
	Scanner Input = new Scanner(System.in);
	
	public void inputAnswer() 
	{
		char answer;
		
		System.out.print("\nAnswer to question 1: ");
		answer = Input.next().charAt(0);
		checkAnswer(1, answer);
		
		System.out.print("\nAnswer to question 2: ");
		answer = Input.next().charAt(0);
		checkAnswer(2, answer);	
		
		System.out.print("\nAnswer to question 3: ");
		answer = Input.next().charAt(0);
		checkAnswer(3, answer);	
		
		System.out.print("\nAnswer to question 4: ");
		answer = Input.next().charAt(0);
		checkAnswer(4, answer);	
		
		System.out.print("\nAnswer to question 5: ");
		answer = Input.next().charAt(0);
		checkAnswer(5, answer);	
	}//end method
	
	public void generateMessage(String status) 
	{
		SecureRandom randomNumbers = new SecureRandom(); 
		
		int x = randomNumbers.nextInt(3);
		
		if(status=="right") 
		{
		switch(x) 
		{
		case 0:
			System.out.print("Good!Keep it up!");
			break;
		case 1:
			System.out.print("Very Good!");
			break;
		case 2:
			System.out.print("Excellent!");
			break;
		case 3:
			System.out.print("Perfect!!!");
			break;
	     	}
		}
		else if (status=="wrong") {
			switch(x) 
			{
			case 0:
				System.out.print("Sorry! Wrong Answer!");
				break;
			case 1:
				System.out.print("wrong!Try the next one");
				break;
			case 2:
				System.out.print("Answer is wrong!Don't give up!");
				break;
			case 3:
				System.out.print("Keep trying!");
				break;
			}
		}
	}//end of method
}//end of class
