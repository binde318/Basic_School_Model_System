import SCHOOL.User;
import SCHOOL.UserInterface;

public class Applicant extends User implements UserInterface {

    private int grade;

    public Applicant(String firstname, String lastname, int age, String email) {
        super(firstname, lastname, age, email);
        this.setAge(age);
        this.setEmail(email);
    }
    public int grade(){
        return grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String login(String firstname, String lastname, String email, int age) {
        return null;
    }
}

