import java.util.Scanner;

public class AskOperator {
    private Scanner inputScan;
    private String operator;

    public AskOperator(Scanner inputScan){
        this.inputScan = inputScan;
    }

    public String AskInput(){
        while (true) {
            operator = inputScan.nextLine();

            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                break;
            }else{
                System.out.println("Not a valid input, please try again");
            }
        }
        return operator;
    }
}
