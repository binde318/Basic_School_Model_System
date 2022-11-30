package SCHOOL;

public class Teacher extends User implements UserInterface{
    private String firstname;
    private String lastname;

    public Teacher(String firstname, String lastname, int age, String email) {
        super(firstname, lastname, age, email);
        this.firstname=firstname;
        this.lastname=lastname;

    }

    public static void SetName(String mosh) {
    }

    public lastname (String mike) {
    }

    public String firstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getStudent() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String login(String firstname, String lastname, String email, int age) {
        return null;
    }
}
