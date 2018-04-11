import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question {
   private ArrayList<String> choices;

   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion() {
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct) {
      // TODO: Implement this method
	   choices.add(choice);
	   if (correct){
		   String c=" "+ choices.size();
		   setAnswer(c);
	   }
   }
   
   public void display() {
       // TODO: Implement this method
	   super.display();
       // Display the question text
      // TODO: Implement this functionality
      // Display the answer choices
      // TODO: Implement this functionality
	   int i=0;
	   for (i=0;i<choices.size();i++){
		   int num=i+1;
		   System.out.println(num+choices.get(i));
	   }
   }
}

