package Task2;

public interface View {

    void showRegistrationForm();

    void showLoginForm();

    void showWorkForm();

    void showGreeting(String name);

    void showDenialOfAccess();

    void showStartForm();

    String getUserData(String text);

    Integer getUserValue(String text);
}
