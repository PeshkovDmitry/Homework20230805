package Task1;

public class CalculatorPresenter implements Presenter{
    private Model model;
    private View view;

    public CalculatorPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void onButtonClicked() {
        double number1 = view.getUserValue();
        double number2 = view.getUserValue();
        String operation = view.getUserOperation();
        switch (operation) {
            case "+":
                model.add(number1, number2);
                break;
            case "-":
                model.sub(number1, number2);
                break;
            case "*":
                model.mult(number1, number2);
                break;
            case "/":
                model.div(number1, number2);
                break;
        }
        double result = model.getResult();
        view.displayResult(result);
    }

}
