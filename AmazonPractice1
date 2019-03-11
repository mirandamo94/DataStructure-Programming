// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.List;
import java.util.ArrayList;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{        
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days)
    {
    // WRITE YOUR CODE HERE
    
    for (int d=0; d<days; d++){
        
        int[] newDay = new int[states.length];
        
    for (int i=0; i<states.length; i++){
        
        int next;
        int prev;
        
        //basecase:
        if (i==0){
            prev=0;
        }
        else prev = states[i-1];
        
        if (i==states.length-1){
            next=0;
        }
        else next = states[i+1];
        
        if (prev == next){
           newDay[i]=0;
        }
        else newDay[i]=1;
    }
        states = newDay;
    }
     
        List<Integer> list = new ArrayList<>(states.length);

		for (int j : states) {
			list.add(Integer.valueOf(j));
		}
    return list;
    }
    
  // METHOD SIGNATURE ENDS
}
