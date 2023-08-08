public class CalculatorModel implements Model{
    double result;

    @Override
    public void add(double number1, double number2) {
        result = number1 + number2;
    }

    @Override
    public void sub(double number1, double number2) {
        result = number1 - number2;
    }

    @Override
    public void mult(double number1, double number2) {
        result = number1 * number2;
    }

    @Override
    public void div(double number1, double number2) {
        result = number1 / number2;
    }

    @Override
    public double getResult() {
        return result;
    }
}
