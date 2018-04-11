import java.util.ArrayList;
import java.util.Scanner;

public class TestSortOptions {

	public static void main(String[] args) {
		ArrayList<Contact> contacts = initializeContactsArray();
        promptForOption(contacts);
	}

    /*
     * Data Initialization
     */
    
    private static ArrayList<Contact> initializeContactsArray() {
        // TODO: Initialize an array of Student objects
    	ArrayList<Contact> contacts=new ArrayList<Contact>();
    		Contact c1= new Contact("Joe", "Jones", "Alabama",16);
    		Contact c2= new Contact("Adam", "Ant", "Illinois",18);
    		Contact c3= new Contact("Bill", "Barnes", "Missouri",19);
    		Contact c4= new Contact("Mark", "Roth", "California",17);
    		Contact c5= new Contact("Jerome", "Howard", "Indiana",17);
    		contacts.add(c1);
    		contacts.add(c2);
    		contacts.add(c3);
    		contacts.add(c4);
    		contacts.add(c5);
    		return contacts;
    		}
    
    
    /*
     * Prompt for the user to enter their option from the keyboard
     *
     * 1 = Sort by last name
     * 2 = Sort by Home State
     * 3 = Sort by Age
     * 0 = End input and exit/terminate the application
     *
     */
    
    private static void promptForOption(ArrayList<Contact> contacts) {
    	int menuChoice=0;
    	Scanner input = new Scanner (System.in);
    	start:    		
    	do{	
    		System.out.println("1 = Sort by last name \t2 = Sort by Home State \t3 = Sort by Age \t0 = End input and exit/terminate the application");
    		try{menuChoice = input.nextInt();}
    		
    		catch (NumberFormatException e) {
                System.out.println("Enter a number!");
                continue;
			}
    		
    		if (menuChoice==1){
    			Selection.sort(contacts,Contact.comparebylname);
    			displayContacts(contacts);
    			continue start;
    		}
    		else if (menuChoice==2){
    			Selection.sort(contacts,Contact.comparebystate);
    			displayContacts(contacts);
    			continue start;
    		}
    		else if (menuChoice==3){
    			Selection.sort(contacts,Contact.comparebyage);
    			displayContacts(contacts);
    			continue start;
    		}
    		else if (menuChoice==0){
    			System.exit(0);
    		}
        } while(menuChoice<3);
    	
    }

    /*
     * Display the Contact information sorted by using the selected option from 
     * the above "promptForOption" method result
     */
    
    private static void displayContacts(ArrayList<Contact> contacts) {
    	for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

}





