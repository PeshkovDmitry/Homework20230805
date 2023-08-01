package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManagementApp {
    public static void main(String[] args) {

        View view = new UserView(new Scanner(System.in));
        List<Model> users = new ArrayList<>();

        users.add(new User("Ivan123","123","Иван"));
        users.add(new User("Peter456","456","Петр"));

        Presenter presenter = new UserPresenter(view, users);

        presenter.run();

    }
}
