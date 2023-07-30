package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Model model = new CalculatorModel();
        Model model = new CheckingCalculatorModel();
//        View view = new CalculatorView(new Scanner(System.in));
        View view = new CheckingCalculatorView(new Scanner(System.in));
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);
        presenter.onButtonClicked();
    }
}