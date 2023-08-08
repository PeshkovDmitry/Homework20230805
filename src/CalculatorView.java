import java.util.Scanner;

public class CalculatorView implements View {

    private Scanner scanner;

    public CalculatorView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayResult(double result) {
        System.out.printf("Результат: %.3f\n", result);
    }

    public double getUserValue() {
        System.out.print("Введите число: ");
        return scanner.nextDouble();
    }

    public String getUserOperation() {
        System.out.print("Введите операцию: ");
        return scanner.next();
    }


}
