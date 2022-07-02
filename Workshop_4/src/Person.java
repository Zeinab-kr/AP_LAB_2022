public class Person {
    private String firstname;
    private String lastname;

    public Person(String firstName, String lastName) {
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }


    @Override
    public String toString() {
        return "" + firstname + " " + lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
