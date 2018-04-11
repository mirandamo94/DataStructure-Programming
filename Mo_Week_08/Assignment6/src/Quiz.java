import java.util.ArrayList;
import java.util.Scanner;

/**
   A quiz contains a list of questions.
*/
public class Quiz {
   private ArrayList<Question> questions;
private Scanner in;
   
   /**
      Constructs a quiz with no questions.
   */
   public Quiz() {
      questions = new ArrayList<Question>();
   }

   /**
      Adds a question to this quiz.
      @param q the question
   */
   public void addQuestion(Question q) {
      questions.add(q);
   }

   /**
      Presents the questions to the user and checks the response.
   */
   public void presentQuestions() {
	   in = new Scanner(System.in);
	   for (Question q: questions){
		   q.display();
		   System.out.println("Your Answer is: ");
		   String r= in.nextLine();
		   System.out.println(q.checkAnswer(r));
	   }
       
   }
}

