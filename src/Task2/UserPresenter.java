package Task2;

import java.util.List;

public class UserPresenter implements Presenter{

    private List<Model> users;

    private View view;

    UserPresenter(View view, List<Model> users) {
        this.view = view;
        this.users = users;
    }

    @Override
    public void run() {
        boolean run = true;
        boolean loginned = false;
        Model currentUser = null;
        while (run) {
            if (loginned) {
                view.showMessage(TextData.HELLO + currentUser.getName() + "\n" + TextData.USER_MENU);
                Integer choice = view.getUserValue(TextData.CHOICE_TEXT);
                switch (choice) {
                    case 1:
                        String name = view.getUserData(TextData.ENTER_NAME);
                        currentUser.setName(name);
                        break;
                    case 2:
                        String password = view.getUserData(TextData.ENTER_PASSWORD);
                        currentUser.setPassword(password);
                        break;
                    case 3:
                        currentUser = null;
                        loginned = false;
                        break;
                }
            } else {
                view.showMessage(TextData.START_MENU);
                Integer choice = view.getUserValue(TextData.CHOICE_TEXT);
                switch (choice) {
                    case 1:
                        view.showMessage(TextData.REGISTER_MESSAGE);
                        String login = view.getUserData(TextData.ENTER_LOGIN);
                        String password = view.getUserData(TextData.ENTER_PASSWORD);
                        String name = view.getUserData(TextData.ENTER_NAME);
                        if (!login.isBlank() && !password.isBlank() && !name.isBlank()) {
                            User newUser = new User(login, password, name);
                            users.add(newUser);
                            loginned = true;
                            currentUser = newUser;
                        }
                        break;
                    case 2:
                        view.showMessage(TextData.LOGIN_MESSAGE);
                        login = view.getUserData(TextData.ENTER_LOGIN);
                        password = view.getUserData(TextData.ENTER_PASSWORD);
                        for (Model user : users) {
                            if (user.getLogin().equals(login) && user.checkPassword(password)) {
                                loginned = true;
                                currentUser = user;
                            }
                        }
                        break;
                    case 3:
                        run = false;
                }
            }
        }
    }
}
