package Task2;

import java.util.Scanner;

public class UserView implements View{

    Scanner scanner;

    UserView(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void showMessage(String text) {
        System.out.print(text);
    }

    @Override
    public String getUserData(String text) {
        System.out.print(text);
        return scanner.next();
    }

    @Override
    public Integer getUserValue(String text) {
        System.out.print(text);
        return scanner.nextInt();
    }
}
