import java.util.Scanner;

public class CheckingCalculatorView extends CalculatorView {

    public CheckingCalculatorView(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getUserOperation() {
        String op =  super.getUserOperation();
        if (op.matches("\\/|\\*|\\+|-")) {
            return op;
        }
        else {
            throw new IllegalArgumentException("Операция должна быть +, -, / или *!");
        }
    }


}
