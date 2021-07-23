package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

class AddressBookMainUC3 {
    public ArrayList<Contact> contactbook = new ArrayList<Contact>();

    public void addEditContact() {

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

        // Edit contact


        System.out.println("Enter the person's name to edit details:");
        String name = scan.next();

        for (Contact person : contactbook) {
            System.out.println(person.toString());

            if (name.equals(first)) {
                System.out.println("select options to edit" +
                        "1. Address" +
                        "2.city" +
                        "3.state" +
                        "4.zip" +
                        "5.mobile_number" +
                        "6.email");
                int num = scan.nextInt();
                switch (num) {
                    case 1: {
                        System.out.println("Enter new address");
                        String newaddress = scan.nextLine();
                        person.setAddress(address);
                        System.out.println("new address is updated");
                        break;
                    }
                    case 2: {
                        System.out.println("Enter new city:");
                        String newcity = scan.nextLine();
                        person.setCity(newcity);
                        System.out.println("new city is updated");
                        break;
                    }
                    case 3: {
                        System.out.println("Enter new state:");
                        String newstate = scan.nextLine();
                        person.setState(newstate);
                        System.out.println("new state is updated");
                        break;
                    }
                    case 4: {
                        System.out.println("Enter new zip code:");
                        int newzip = scan.nextInt();
                        person.setZip(newzip);
                        System.out.println("new zip is updated");
                        break;
                    }
                    case 5: {
                        System.out.println("Enter new mobile number:");
                        String newmobile_number = scan.nextLine();
                        person.setMobileNumber(newmobile_number);
                        System.out.println("new mobile_number is updated");
                        break;
                    }
                    case 6: {
                        System.out.println("Enter new email:");
                        String newemail = scan.nextLine();
                        person.setEmail(newemail);
                        System.out.println("new email is updated");
                        break;
                    }
                    default:
                        System.out.println("please enter validate name");
                }
            }

        }
    }


    public static void main(String[] args) {
        System.out.println("-------------Welcome To The Address Book Problem--------------------");
        AddressBookMainUC3 address1 = new AddressBookMainUC3();
        address1.addEditContact();
        address1.displayperson();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Contact");
        System.out.println("2.Edit Contact");
        System.out.println("3.Display Contact");
        System.out.println("4.Exit");
        int k = 0;
        while (k == 0) {
            System.out.println("Enter the choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    address1.addEditContact();
                    break;
                case 2:
                    address1.displayperson();
                    break;
                case 3:
                    address1.editPerson();
                    break;
                case 4:
                    System.out.println("Exit");
                    k = 1;
                    break;
            }
        }
    }

    private void displayperson() {
    }

    private void editPerson() {
    }
}

class Contact {
    public Contact(String first, String last, String address, String city, String state, String email, long mobileNo, int zip) {
    }


    public void setAddress(String address) {
    }

    public void setEmail(String email) {
    }

    public void setCity(String city) {
    }

    public void setState(String state) {
    }

    public void setMobileNumber(String mobile_number) {
    }

    public void setZip(String zip) {
    }

    public void setZip(int newzip) {
    }
}

