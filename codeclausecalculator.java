import java.util.Scanner;

public class codeclausecalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter the operation (+, -, *, /, %): ");
        String operation = sc.next();

        int result = performOperation(firstNumber, secondNumber, operation);

       // System.out.println("Result:\n " + result);
        sc.close();
    }

    public static int performOperation(int a, int b, String op) {
        int result = 0;
        switch (op) {
            case "+" -> {
                result = a + b;
                System.out.print("\n Addition of two nummber are\n"+ result);
            }
            case "-" -> {
                result = a - b;
                System.out.print("\n Substraction of two number are\n"+ result);
            }
            case "*" -> {
                result = a * b;
                System.out.print("\n multiplication of two nummber are \n\t"+ result);
            }
            case "/" -> {
                if (b != 0) {
                    result = a / b;
                    System.out.print("\n division of two number are\n"+ result);
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            }
            case "%" -> {
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            }
            default -> {
                System.out.println("Invalid operation");
                return 0;
            }
        }
        return result;
    }
}
