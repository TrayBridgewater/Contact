import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    // Runs a series of tests to ensure that the object is being instantiated correctly
    // and that the length requirements are working
	
    @Test
    void testContactID() {
        Contact testContact = new Contact("0000000000", "firstName", "lastName", "0000000000", "TestContact@Gmail.com"); 

        assertEquals("0000000000", testContact.getContactId());
        assertNotNull(testContact.getContactId());
        
		// Test: setter works
		String oldContactId = testContact.getContactId();
		testContact.setContactId("Two");
		assertNotEquals(oldContactId,testContact.getContactId());
    }

    @Test
    void testFirstName() {
        Contact testContact = new Contact("0000000000", "firstName", "lastName", "0000000000", "TestContact@Gmail.com"); 

        assertEquals("firstName", testContact.getFirstName());
        assertNotNull(testContact.getContactId());
        
		// Test: setter works
		String oldFirstName = testContact.getFirstName();
		testContact.setFirstName("Jimbo");
		assertNotEquals(oldFirstName,testContact.getFirstName());
    }

    @Test
    void testLastName() {
        Contact testContact = new Contact("0000000000", "firstName", "lastName", "0000000000", "TestContact@Gmail.com"); 

        assertEquals("lastName", testContact.getLastName());
        assertNotNull(testContact.getContactId());
        
		// Test: setter works
		String oldLastName = testContact.getLastName();
		testContact.setLastName("Jimboson");
		assertNotEquals(oldLastName,testContact.getLastName());
    }

    @Test
    void testPhoneNumber() {
        Contact testContact = new Contact("0000000000", "firstName", "lastName", "0000000000", "TestContact@Gmail.com"); 

        assertEquals("0000000000", testContact.getPhoneNumber());
        assertNotNull(testContact.getContactId());
        
		// Test: setter works
		String oldPhoneNumber = testContact.getPhoneNumber();
		testContact.setPhoneNumber("2818324321");
		assertNotEquals(oldPhoneNumber,testContact.getPhoneNumber());
    }

    @Test
    void testAddress() {
        Contact testContact = new Contact("0000000000", "firstName", "lastName", "0000000000", "TestContact@Gmail.com"); 

        assertEquals("TestContact@Gmail.com", testContact.getEmailAddress());
        assertNotNull(testContact.getContactId());
        
		// Test: setter works
		String oldAddress = testContact.getEmailAddress();
		testContact.setEmailAddress("Jimboson@Jimbo.com");
		assertNotEquals(oldAddress,testContact.getEmailAddress());
    }
}