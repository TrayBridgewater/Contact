import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ContactServiceTest {

	@Test
	// Test: does addContact add a new contact to the list?
	void testUniqueIdAddContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "FakeAddress@Address.com");
		// addContact() will only return true if it adds the contact
		assertTrue(contactService.addContact(contact));		
	}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		Contact firstContact = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "FakeAddress@Address.com");
		Contact secondContact = new Contact("22245678", "James", "Allison", "0000000000", "FakeAddress2@Address.com");

		// Test: Deleting contacts works
		contactService.addContact(firstContact);
		String leadingContactId = contactService.getContacts().get(0).getContactId();
		
		assertEquals(leadingContactId, firstContact.getContactId());
		
		contactService.addContact(secondContact);
		contactService.deleteContact(leadingContactId);
		
		leadingContactId = contactService.getContacts().get(0).getContactId();
		assertNotEquals(leadingContactId, firstContact.getContactId());

	
	}
	
	@Test
	void testUpdateFirstName() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "FakeAddress@Address.com");
		contactService.addContact(contact);

		assertEquals(contactService.getContacts().get(0).getFirstName(), "Jeremy"); 
		
		contactService.updateFirstName("12345678", "Jimmy");
		// Test: name should no longer be the same
		assertNotEquals(contactService.getContacts().get(0).getFirstName(), "Jeremy"); 
	}
	
	@Test
	void testUpdateSurname() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "FakeAddress@Address.com");
		contactService.addContact(contact);

		assertEquals(contactService.getContacts().get(0).getLastName(), "Morrison"); 
		
		contactService.updateSurname("12345678", "Mortyson");
		// Test: name should no longer be the same
		assertNotEquals(contactService.getContacts().get(0).getLastName(), "Morrison"); 
	}
	
	@Test
	void testUpdateNumber() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "FakeAddress@Address.com");
		contactService.addContact(contact);

		assertEquals(contactService.getContacts().get(0).getPhoneNumber(), "7019290601"); 
		
		contactService.updateNumber("12345678", "0000000000");
		// Test: name should no longer be the same
		assertNotEquals(contactService.getContacts().get(0).getPhoneNumber(), "7019290601"); 
	}
	
	void testUpdateEmailAddress() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345678", "Jeremy", "Morrison", "7019290601", "FakeAddress@Address.com");
		contactService.addContact(contact);

		assertEquals(contactService.getContacts().get(0).getEmailAddress(), "FakeAddress@Address.com"); 
		
		contactService.updateEmailAddress("12345678", "NewFakeAddress@Address.com");
		// Test: name should no longer be the same
		assertNotEquals(contactService.getContacts().get(0).getPhoneNumber(), "FakeAddress@Address.com"); 
	}
	
}
