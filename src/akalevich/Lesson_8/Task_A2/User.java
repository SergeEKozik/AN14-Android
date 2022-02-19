package akalevich.Lesson_8.Task_A2;

public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void showLogin() {
        System.out.println("Login: " + this.login);
    }

    public void showPassword() {
        System.out.println("Password: " + this.password);
    }
}
