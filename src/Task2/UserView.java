package Task2;

import java.util.Scanner;

public class UserView implements View{

    Scanner scanner;

    UserView(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void showRegistrationForm() {
        System.out.println("Для регистрации нового пользователя введите логин, пароль и имя.");
    }

    @Override
    public void showLoginForm() {
        System.out.println("Для входа в систему введите логин и пароль.");
    }

    @Override
    public void showWorkForm() {
        System.out.println("1 - Изменить имя; \n 2 - Изменить пароль; \n 3 - Выйти из аккаунта" );
    }

    @Override
    public void showGreeting(String name) {
        System.out.println("Здравствуйте, " + name);
    }

    @Override
    public void showDenialOfAccess() {
        System.out.println("Отказано в доступе. Логин и/или пароль неверны.");
    }

    @Override
    public void showStartForm() {
        System.out.println("Здравствуйте: \n" +
                "1 - Регистрация\n" +
                "2 - Вход\n" +
                "3 - Завершение работы");
    }

    @Override
    public String getUserData(String text) {
        System.out.print(text);
        return scanner.nextLine();
    }

    @Override
    public Integer getUserValue(String text) {
        System.out.print(text);
        return scanner.nextInt();
    }
}
