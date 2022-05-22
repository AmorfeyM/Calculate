import java.util.Scanner;

public class Main {
    public static String calc(String input) throws Exception {
        String[] symbols = input.split("[-+*/]");
        if (symbols.length > 2) {
            throw new Exception();
        }

        NumObject firstNumber = NumberService.parseAndValidate(symbols[0]);
        NumObject secondNumber = NumberService.parseAndValidate(symbols[1], firstNumber.getType());

        int result;
        String operand = null;
        String[] operands = new String[]{"-", "+", "*", "/"};
        for (char c : input.toCharArray()) {
            for (String s : operands) {
                if (String.valueOf(c).equals(s)) {
                    operand = String.valueOf(c);
                }
            }
        }

        
        switch (operand) {
            case "+":
                result = firstNumber.getValue() + secondNumber.getValue();
                break;
            case "-":
                result = firstNumber.getValue() - secondNumber.getValue();
                break;
            case "*":
                result = firstNumber.getValue() * secondNumber.getValue();
                break;
            case "/":
                result = firstNumber.getValue() / secondNumber.getValue();
                break;
            default:
                throw new Exception();
        }

        if (firstNumber.getType() == Type.ROMAN) {
            return NumberService.toRomanNumber(result);
        } else return String.valueOf(result);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Main main = new Main();
        try {
            System.out.println(main.calc(inputString));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
