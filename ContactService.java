import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ContactService {
	public List<Contact> contactList = new ArrayList<>();
	
	List<Contact> getContacts() {
		return contactList;
	}
	
	public String generateId() {
		Random rand = new Random(); 
		int id = rand.nextInt(9000000) + 1000000;		
		return String.valueOf(id);
	}

	// adds new contacts to list
	public boolean addContact(Contact newContact) {
		int alreadyInList = 0;
        for (Contact contact:contactList) {
        	if (contact.getContactId() == newContact.getContactId()) {
        		alreadyInList = 1; // contact is already in list
        		break;
        	}
        }

        if (alreadyInList == 0) { // contact is not in list; add and return true
        	contactList.add(newContact);
        	return true;
        }
        
        else {
        	return false;
        }
	}

    // Uses contact ID to delete contact 
	public void deleteContact(String contactId) {
		for (Contact contact : contactList) {
			if (contact.getContactId() == contactId) {
				contactList.remove(contact);
				break;
			} 
		}
	}

	// Updates a contact's first name
	public void updateFirstName(String contactId, String newName) {
		for (Contact contact:contactList) {
			if (contact.getContactId() == contactId) {
				contact.setFirstName(newName);
				break;
			}
		}
	}
	
	// Updates a contact's last name
	public void updateSurname(String contactId, String newName) {
		for (Contact contact:contactList) {
			if (contact.getContactId() == contactId) {
				contact.setLastName(newName);
				break;
			}
		}
	}
		
	// Updates a contact's email address
	public void updateEmailAddress(String contactId, String newEmail) {
		for (Contact contact:contactList) {
			if (contact.getContactId() == contactId) {
				contact.setEmailAddress(newEmail);
				break;
			}
		}
	}
	
	// Updates a contact's last name
	public void updateNumber(String contactId, String newNumber) {
		for (Contact contact:contactList) {
			if (contact.getContactId() == contactId) {
				contact.setPhoneNumber(newNumber);
				break;
			}
		}
	}


}