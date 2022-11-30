package SCHOOL;

public class Principal extends User implements UserInterface{

    public Principal(String firstname, String lastname, int age, String email) {
        super(firstname, lastname, age, email);

    }

    public void punish(boolean Goodcharacter){
        if (Goodcharacter==true){
            System.out.println("Nice behaviour");
        }else{
            System.out.println("punish");
        }

    }

    @Override
    public String login(String firstname, String lastname, String email, int age) {
        return firstname+firstname;
    }
}
