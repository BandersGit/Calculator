import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number:");
        int firstNumber = AskInput(input);

        System.out.println("Input one of these operators (+, -, *, /)");
        String operator = AskOperator(input);

        System.out.println("Input the first number:");
        int secondNumber = AskInput(input);

        System.out.println(firstNumber + operator + secondNumber);
        
        input.close();
    }

    public static int AskInput(Scanner input){
        Scanner numInput = input;
        int number;
        
        do {
            try {
                String in = numInput.nextLine();
                number = Integer.parseInt(in);
                break;
            } catch (Exception e) {
                System.out.println("Not a valid input, please try again");
            }
        } while (true);

        return number;
    }

    public static String AskOperator(Scanner input){
        Scanner opInput = input;
        String operator;

        while (true) {
            operator = opInput.nextLine();

            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                break;
            }else{
                System.out.println("Not a valid input, please try again");
            }
        }

        return operator;
    }
}
