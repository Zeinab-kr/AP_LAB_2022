import java.util.Objects;

public class Contact {
    private String group;
    private String email;
    private String firstname;
    private String lastname;
    private PhoneNumber phoneNumber;
    private Address address;

    public Contact(String group, String email, String firstname, String lastname
            , PhoneNumber phoneNumber, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.group = (group.equals("-") ? null : group);
        this.email = (email.equals("-") ? null : email);
    }

    @Override
    public boolean equals(Object o) {
        Contact contact = (Contact) o;
        return Objects.equals(group, contact.group)
                && Objects.equals(email, contact.email)
                && Objects.equals(firstname, contact.firstname)
                && Objects.equals(lastname, contact.lastname)
                && Objects.equals(phoneNumber, contact.phoneNumber)
                && Objects.equals(address, contact.address);
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
