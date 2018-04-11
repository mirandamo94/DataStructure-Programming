package lecture2;

public class TestMyLP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] array = {"Joe", "Bill", "Ann", "Omar", "Sydney", "Ellen", "Mark", "Marshall", "Earl", "Vicky"};
		
        MyLP<String, Integer> st = new MyLP<String, Integer>();
        for (int i = 0; i< 10; i++) {
            String key = array[i];
            st.put(key, i);
        }

        // print keys
        for (String s : st.keys()) 
            System.out.println(s + " " + st.get(s)); 
	}

}
