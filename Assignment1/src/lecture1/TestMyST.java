package lecture1;

public class TestMyST {

//@param args
	 
public static void main(String[] args) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String sampleString = "SEARCHEXAMPLE";
		String key = "";

		MyST<String, Integer> st = new MyST<String, Integer>();

		for (int i = 0; i < sampleString.length(); i++) {
			key = "" + sampleString.charAt(i);
			st.put(key, i);
		}
		
		for (String s : st.keys()) {
			System.out.println(s + " " + st.get(s));
		}
		
		System.out.println("size = " + st.size());
		if (st.isEmpty() == true) {
			System.out.println("st is empty");
		} else {
			System.out.println("st is not empty");
		}
		
		for (int i = 0; i < alphabet.length(); i++) {
			key = "" + alphabet.charAt(i);
			if (st.contains(key)) {
				System.out.println("st does contain "+ key);
			} else {
				System.out.println("st does not contain "+ key);
			}
		}

	}

}
