package Task2;

public class User implements Model {
    private String login;

    private String password;

    private String name;

    User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    };

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }
}
