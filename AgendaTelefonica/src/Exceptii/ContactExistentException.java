package Exceptii;

import classpackage.Contact;

   public class ContactExistentException extends RuntimeException{
    Contact contact;
    String Contact;
    public ContactExistentException(String contact){
        this.Contact = contact;
    }
    
    public ContactExistentException(String contact, String message){
        super(message);
        this.Contact = contact;
    }
    
    public String getContactExistentException(){
        return this.Contact;
    }
}
