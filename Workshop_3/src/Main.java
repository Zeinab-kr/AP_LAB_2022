import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(100);
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("1. add contact\n"
                    + "2. remove contact\n"
                    + "3. show group contacts\n"
                    + "4. show contact info\n"
                    + "5. show all contacts\n"
                    + "6. exit\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter contact's name: ");
                    String nameToAdd = scanner.nextLine();
                    String[] nameToAddSplit = nameToAdd.split(" ", 2);

                    System.out.println("Enter contact's group: ");
                    String group = scanner.nextLine();

                    System.out.println("Enter contact's email: ");
                    String email = scanner.nextLine();

                    System.out.println("Enter country code: ");
                    String countryCode = scanner.nextLine();

                    System.out.println("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.println("Enter contact's zip code: ");
                    String zipCode = scanner.nextLine();

                    System.out.println("Enter contact's country: ");
                    String country = scanner.nextLine();

                    System.out.println("Enter contact's city: ");
                    String city = scanner.nextLine();

                    Address address = new Address(zipCode, country, city);
                    PhoneNumber fullPhoneNumber = new PhoneNumber(countryCode, phoneNumber);
                    Contact contact = new Contact(group, email, nameToAddSplit[0], nameToAddSplit[1], fullPhoneNumber, address);
                    if (phoneBook.addContact(contact)) {
                        System.out.println("Contact added successfully\n");
                    } else {
                        System.out.println("Contact already exists in your phone book!\n");
                    }
                    break;

                case 2:
                    System.out.println("Enter contact's name: ");
                    String nameToDelete = scanner.nextLine();
                    String[] nameToDeleteSplit = nameToDelete.split(" ", 2);
                    if (phoneBook.deleteContact(nameToDeleteSplit[0], nameToDeleteSplit[1])) {
                        System.out.println("Contact deleted\n");
                    } else {
                        System.out.println("Contact not found!\n");
                    }
                    break;

                case 3:
                    System.out.println("Enter group's title: ");
                    String groupToFind = scanner.nextLine();
                    Contact[] groupContacts = new Contact[phoneBook.getSize()];
                    groupContacts = phoneBook.findContacts(groupToFind);
                    if (groupContacts != null) {
                        System.out.println("Group \"" + groupToFind + "\":\n");
                        phoneBook.printContacts(groupContacts);
                    } else {
                        System.out.println("Group not found!\n");
                    }
                    break;

                case 4:
                    System.out.println("Enter contact's name: ");
                    String nameToPrintInfo = scanner.nextLine();
                    String[] namePISplit = nameToPrintInfo.split(" ", 2);
                    Contact contact1 = phoneBook.findContact(namePISplit[0], namePISplit[1]);
                    phoneBook.printContact(contact1);
                    break;

                case 5:
                    phoneBook.printContacts();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid choice!\n");
            }
        }
    }
}
