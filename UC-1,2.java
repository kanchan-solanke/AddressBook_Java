package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public ArrayList<Contact> contactbook = new ArrayList<Contact>();

    public void addContact() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name");
        String first = scan.nextLine();
        System.out.println("Enter Last Name");
        String last = scan.nextLine();
        System.out.println("Enter Address");
        String address = scan.nextLine();
        System.out.println("Enter City");
        String city = scan.nextLine();
        System.out.println("Enter State");
        String state = scan.nextLine();
        System.out.println("Enter Zip Code");
         int zip = scan.nextInt();
        System.out.println("Enter Phone Number");
        long mobileNo = scan.nextLong();
        System.out.println("Enter E-mail");
        String email = scan.next();
        // constructor in arraylist
        Contact contact = new Contact(first, last, address, city, state, email, mobileNo, zip);
        contactbook.add(contact);
        System.out.println("Contact added Successfully");
    }

    public void displayPerson() {
        System.out.println("Entered Person Details is:");
        for (Contact person : contactbook) {
            System.out.println(person.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("-------------Welcome To The Address Book Problem--------------------");
        AddressBookMain address1 = new AddressBookMain();
        address1.addContact();
        address1.displayPerson();
    }

    private class Contact {
        public Contact(String first, String last, String address, String city, String state, String email, long mobileNo, int zip) {
        }
    }
}
