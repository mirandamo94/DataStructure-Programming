import java.util.ArrayList;
import java.util.Comparator;


/*
 * The Contact class will have 3 properties:
 * 		firstname   - String
 * 		lastname    - String
 * 		homestate   - String
 * 		age         - Integer
 */

public class Contact {
	
	private String firstname;
	private String lastname;
	private String homestate;
	private int age;
	
	public Contact(String firstname, String lastname, String homestate, Integer age){
		super();
		this.firstname=firstname;
		this.lastname=lastname;
		this.homestate=homestate;
		this.age=age;
	}
	
	
	public String getfname(){
		return firstname;
	}
	
	public void setfname(String firstname){
		this.firstname=firstname;
	}
	
	public String getlname(){
		return lastname;
	}
	
	public void setlname(String lastname){
		this.lastname=lastname;
	}
	
	public String getstate(){
		return homestate;
	}
	
	public void setstate(String homestate){
		this.homestate=homestate;
	}
	
	public Integer getage(){
		return age;
	}
	
	public void setage(Integer age){
		this.age=age;
	}
	@override
	public String toString() {
		return "Contacts [first name= "+firstname+", last name= "+ lastname+", home state= "+homestate+", age="+age+"]";
	}
	public static Comparator<Contact> comparebylname = new Comparator<Contact>() {
		public int compare(Contact o1, Contact o2) {
			return o1.getlname().compareTo(o2.getlname());
		}
	};
	public static Comparator<Contact> comparebystate = new Comparator<Contact>() {
		public int compare(Contact o1, Contact o2) {
			return o1.getstate().compareTo(o2.getstate());
		}
	};
	public static Comparator<Contact> comparebyage = new Comparator<Contact>() {
		public int compare(Contact o1, Contact o2) {
			return o1.getage().compareTo(o2.getage());
		}
	};

	

	
}



