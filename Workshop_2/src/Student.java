public class Student {
    private String firstname;
    private String lastname;
    private String id;
    private double grade;

    // constructor
    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        grade = 0;
        if (id.length() != 7) {
            System.out.println("ID not valid!!!");
            return;
        }
        this.id = id;
    }

    public void printStudentInfo() {
        System.out.println(firstname + " " + lastname
                + "\nID: " + id + "\nGrade: " + grade + "\n");
    }
    // setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(String id) {
        if (id.length() != 7) {
            System.out.println("ID not valid!!!");
            return;
        }
        this.id = id;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // getters

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }
}
