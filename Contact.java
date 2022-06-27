
public class Contact {
    // Class Attributes 
    private String contactId; 
    private String firstName; // <10 chars
    private String lastName; // <10chars 
    private String phoneNumber; //exactly 10 chars 
    private String emailAddress; //<30chars
    
    // Constructors 
    public Contact(String contactId) {
        this.setContactId(contactId);
        this.setFirstName("UNINITIALIZED");
        this.setLastName("UNINITIALIZED");
        this.setPhoneNumber("UNINITIALIZED");
        this.setEmailAddress("UNINITIALIZED");
    }
    
    public Contact(String contactId, String firstName, String lastName, String phoneNumber, String emailAddress) {
       this.setContactId(contactId);
       this.setFirstName(firstName);
       this.setLastName(lastName);
       this.setPhoneNumber(phoneNumber);
       this.setEmailAddress(emailAddress);
   }
	
    // Setters
    public void setContactId(String contactId) { // <10 chars
        if (contactId.length() <= 10) {
            this.contactId = contactId;
        }
        
        else {
            throw new IllegalArgumentException("ERROR: string must be 10 characters or less. ");
        }
    }
    
    public void setFirstName(String firstName) {
        if (firstName.length() <= 10) {
            this.firstName = firstName;
        }  
        
        else {
            throw new IllegalArgumentException("ERROR: string must be 10 characters or less. ");
        }
    }
    
    public void setLastName(String lastName) {
        if (lastName.length() <= 10) {
            this.lastName = lastName;
        }  
        
        else {
            throw new IllegalArgumentException("ERROR: string must be 10 characters or less. ");
        }
    }
    
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }  
        
        else {
            throw new IllegalArgumentException("ERROR: string must be exactly 10 characters.");
        }
    }  

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.length() <= 30) {
            this.emailAddress = emailAddress;
        }  
        
        else {
            throw new IllegalArgumentException("ERROR: string must be 30 characters or less. ");
        }
    }
    
    // Getters
    public String getContactId() {
        return this.contactId; 
    }
    
    public String getFirstName() {
        return this.firstName; 
    }
    
    public String getLastName() {
        return this.lastName; 
    }
    
    public String getPhoneNumber() {
        return this.phoneNumber; 
    }
    
    public String getEmailAddress() {
        return this.emailAddress; 
    }
}