 import java.util.Arrays;

/**
 * This is a skeleton file for your homework. Edit the sections marked TODO. You
 * may add new functions. You may also edit the function "main" to test your
 * code.
 *
 * You must not add static variables. You MAY add static functions, just not
 * static variables.
 *
 * It is okay to add functions, such as
 *
 *     public static double sumHelper (double[] list, int i, double sumSoFar) {
 * 
 * but it is NOT okay to add static variables, such as
 *
 * public static int x;
 * 
 * As for homework 1, you must not change the declaration of any method.
 * 
 * You can edit the main function all you want. I will not run your main
 * function when grading.
 */
public class CSC402_Homework03 {

	/**
	 * As a model, here is a minValue function, both iteratively and recursively
	 */
	/** iterative version */
	public static double minValueIterative (double[] list) {
		double result = list[0];
		int i = 1;
		while (i < list.length) {
			if (list[i] < result) result = list[i];
			i = i + 1;
		}
		return result;
	}

	/** recursive version */
	public static double minValue (double[] list) {
		return minValueHelper (list, 1, list[0]);
	}
	private static double minValueHelper (double[] list, int i, double result) {
		if (i < list.length) {
			if (list[i] < result) result = list[i];
			result = minValueHelper (list, i + 1, result);
		}
		return result;
	}

	/**
	 * PROBLEM 1: Translate the following sum function from iterative to
	 * recursive.
	 *
	 * You should write a helper method. You may not use any "fields" to solve
	 * this problem (a field is a variable that is declared "outside" of the
	 * function declaration --- either before or after).
	 */
	public static double sumIterative (double[] a) {
		double result = 0.0;
		int i = 0;
		while (i < a.length) {
			result = result + a[i];
			i = i + 1;
		}
		return result;
	}
	public static double sum (double[] a) {
			return sumHelper(a,0,0);
	}
	public static double sumHelper(double[] list, int i, double result){
		if (i<list.length){
			result= list[i]+sumHelper(list,i+1,result);
		}
		return result;
	}
		
	

	/**
	 * PROBLEM 2: Do the same translation for this in-place reverse function
	 *
	 * You should write a helper method. You may not use any "fields" to solve
	 * this problem (a field is a variable that is declared "outside" of the
	 * function declaration --- either before or after).
	 */
	public static void reverseIterative (double[] a) {
		int hi = a.length - 1;
		int lo = 0;
		while (lo < hi) {
			double loVal = a[lo];
			double hiVal = a[hi];
			a[hi] = loVal;
			a[lo] = hiVal;
			lo = lo + 1;
			hi = hi - 1;
		}
	}
	public static void reverse (double[] a) {
		reverseHelper(a,0,a.length-1);	
		}
	public static double[] reverseHelper(double[] list,int i,int j){
		if (i>=j){
			return list;
		}
		else{
			double flipped=list[i];
			list[i]=list[j];
			list[j]=flipped;
		}
		return reverseHelper(list,i+1,j-1);
	}

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		double[] list0 = new double[] {};
		double[] list1 = new double[] { 5 };
		double[] list2 = new double[] { -3, 5 };
		double[] list3 = new double[] { 2, -3, 5 };
		double[] list4 = new double[] { -1, 2, -3, 5 };
		double[] list5 = new double[] { 33, 44, 55 };

		System.out.println("Display the sum of the array contents");
		System.out.println ("list5: " +sum (list5));
		System.out.println ("list0: " +sum (list0));
		System.out.println ("list1: " +sum (list1));
		System.out.println ("list2: " +sum (list2));
		System.out.println ("list3: " +sum (list3));
		System.out.println ("list4: " +sum (list4));

		System.out.println("Reversing the lists");
		reverse (list0);
		System.out.println ("list0: " +Arrays.toString (list0));
		reverse (list1);
		System.out.println ("list1: " +Arrays.toString (list1));
		reverse (list2);
		System.out.println ("list2: " +Arrays.toString (list2));
		reverse (list3);
		System.out.println ("list3: " +Arrays.toString (list3));
		reverse (list4);
		System.out.println ("list4: " +Arrays.toString (list4));
		reverse (list5);
		System.out.println ("list5: " +Arrays.toString (list5));
	}

}


