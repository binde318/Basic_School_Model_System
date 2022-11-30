package SCHOOL;

public class Student extends User implements UserInterface{


    public Student(String firstname, String lastname, int age, String email) {
        super(firstname, lastname, age, email);
    }

    public String getFirstname() {
        return getFirstname();
    }

    public String getLastname() {
        return getLastname();
    }

    public int getAge() {
        return getAge();
    }

    public String getEmail() {
        return getEmail();
    }

    public void setFirstname(String firstname) {
        this.setFirstname(firstname);
    }

    public void setLastname(String lastname) {
        this.setLastname(lastname);
    }

    public void setAge(int age) {
        this.setAge(age);
    }

    public void setEmail(String email) {
        this.setEmail(email);
    }

    @Override
    public String login(String firstname, String lastname, String email, int age) {
        return null;
    }
}

