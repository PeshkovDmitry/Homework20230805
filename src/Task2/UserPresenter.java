package Task2;

import java.util.List;

public class UserPresenter implements Presenter{

    private List<Model> models;

    private View view;

    UserPresenter(View view, List<Model> models) {
        this.view = view;
        this.models = models;
    }

    @Override
    public void run() {
        boolean run = true;
        boolean loginned = false;
        String currentLogin = "";
        while (run) {
            if (loginned) {
                view.showWorkForm();

            } else {
                view.showStartForm();
                Integer choice = view.getUserValue("-> ");
                switch (choice) {
                    case 1:
                        view.showRegistrationForm();
                        String login = view.getUserData("Введите логин: ");
                        String password = view.getUserData("Введите пароль: ");
                        String name = view.getUserData("Введите имя: ");
                        models.add(new User(login, password, name));
                        loginned = true;
                        break;
                    case 2:
                        view.showLoginForm();
                        login = view.getUserData("Введите логин: ");
                        password = view.getUserData("Введите пароль: ");
                        break;
                    case 3:
                        run = false;
                }

            }

        }
    }

}
