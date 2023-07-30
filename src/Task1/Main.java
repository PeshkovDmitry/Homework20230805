package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Model model = new CalculatorModel();
        View view = new CalculatorView(new Scanner(System.in));
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);
        presenter.onButtonClicked();
    }
}