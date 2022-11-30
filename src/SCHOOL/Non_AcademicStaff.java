package SCHOOL;

public class Non_AcademicStaff extends User implements UserInterface{
   private String duty;

    public Non_AcademicStaff(String firstname, String lastname, int age, String email, String duty) {
        super(firstname, lastname, age, email);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getEmail() {
        return getEmail();
    }

    public void setEmail(String email) {
        this.setEmail(email);
    }

    public int getAge() {
        return getAge();
    }

    public void setAge(int age) {
        this.setAge(age);
    }

    @Override
    public String login(String firstname, String lastname, String email, int age) {
        return null;
    }
}
