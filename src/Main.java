import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Model model = new CalculatorModel();
//        View view = new CalculatorView(new Scanner(System.in));
//        Presenter presenter = new CalculatorPresenter(model, view);
        Model model = new CheckingCalculatorModel();
        View view = new CheckingCalculatorView(new Scanner(System.in));
        Presenter presenter = new CheckingCalculatorPresenter(model, view);
        presenter.onButtonClicked();
    }
}