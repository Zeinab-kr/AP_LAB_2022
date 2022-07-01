public class PhoneBook {
    private int size;
    private Contact[] contacts = new Contact[size];
    private int currentNumber = 0;

    public PhoneBook(int size) {
        this.size = size;
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getFirstname(), contact.getLastname()) != null) {
            return false;
        }
        contacts[currentNumber++] = contact;
        return true;
    }

    public boolean deleteContact(String firstname, String lastname) {
        if (findContact(firstname, lastname) == null) {
            return false;
        }
        // delete the contact and shift all contacts
        contacts[indexOf(firstname, lastname)] = null;
        for (int i = indexOf(firstname, lastname); i < contacts.length; i++) {
            contacts[i] = contacts[i + 1];
            contacts[i + 1] = null;
        }
        return true;
    }

    public Contact findContact(String firstname, String lastname) {
        for (Contact contactTemp : contacts) {
            if (contactTemp.getFirstname().equals(firstname) && contactTemp.getLastname().equals(lastname)) {
                return contactTemp;
            }
        }
        return null;
    }

    public Contact[] findContacts(String group) {
        Contact[] groupedContacts = new Contact[size];
        int i = 0;
        boolean matchFound = false;
        for (Contact contactTemp : contacts) {
            if (contactTemp.getGroup().equals(group)) {
                groupedContacts[i++] = contactTemp;
                matchFound = true;
            }
        }
        if (matchFound) {
            return groupedContacts;
        } else {
            return null;
        }
    }

    public int indexOf(String firstname, String lastname) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getFirstname().equals(firstname) && contacts[i].getLastname().equals(lastname)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        for (int i = 0; i < contacts.length; i++) {
            System.out.println("Contact " + i + ":\n"
            + "    First Name: " + contacts[i].getFirstname() + "\n"
            + "    Last Name: " + contacts[i].getLastname() + "\n"
            + "    Phone Number: " + contacts[i].getPhoneNumber() + "\n"
            + "    Email: " + ((contacts[i].getEmail() == null) ? "no email" : contacts[i].getEmail()) + "\n"
            + "    Address:" + ((contacts[i].getAddress() == null) ? "no address" : contacts[i].getAddress()) + "\n"
            + "    Group:" + ((contacts[i].getGroup() == null) ? "no group" : contacts[i].getGroup()) + "\n\n");
        }
    }

    public void printContact(Contact contact) {
        System.out.println(
                  "First Name: " + contact.getFirstname() + "\n"
                + "Last Name: " + contact.getLastname() + "\n"
                + "Phone Number: " + contact.getPhoneNumber() + "\n"
                + "Email: " + ((contact.getEmail() == null) ? "no email" : contact.getEmail()) + "\n"
                + "Address:" + ((contact.getAddress() == null) ? "no address" : contact.getAddress()) + "\n"
                + "Group:" + ((contact.getGroup() == null) ? "no group" : contact.getGroup()) + "\n\n");
    }
    public void printContacts(Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(
                      "    First Name: " + contacts[i].getFirstname() + "\n"
                    + "    Last Name: " + contacts[i].getLastname() + "\n"
                    + "    Phone Number: " + contacts[i].getPhoneNumber() + "\n"
                    + "    Email: " + ((contacts[i].getEmail() == null) ? "no email" : contacts[i].getEmail()) + "\n"
                    + "    Address:" + ((contacts[i].getAddress() == null) ? "no address" : contacts[i].getAddress()) + "\n");
        }
    }

    public int getSize() {
        return size;
    }
}
