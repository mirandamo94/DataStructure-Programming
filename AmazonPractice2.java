// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
import java.util.*;
class GCD
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE
        //base case:
        if(arr.length==0) return 0;
        List<Integer> commonDiv = primeDiv(arr[0]);
        for (int i=1; i<arr.length;i++){
            commonDiv.retainAll(primeDiv(arr[i]));
        }
        int largest = 1;
        for (int j=0;j<commonDiv.size(); j++){
            largest *= commonDiv.get(j);
        }
        return largest;
    }
    // METHOD SIGNATURE ENDS
    public List<Integer> primeDiv(int num){
        
        List<Integer> divs = new ArrayList<Integer>();
        divs.add(1);
        if(num%2 == 0) divs.add(2);
        for (int i=3; i<Math.sqrt(num);i+=2){
            if(num%i==0) divs.add(i);
        }
        return divs;
    }
    
    
}
