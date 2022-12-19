import java.util.Scanner;

public class InputHandler {
    private String numberQuestion1;
    private String numberQuestion2;
    private String operatorQuestion;
    private String operator;

    private int firstNumber;
    private int secondNumber;

    private Scanner inputScan;
    private AskNumber askNumber;
    private AskOperator askOperator;

    public InputHandler(){
        numberQuestion1 = "Input the first number:";
        numberQuestion2 = "Input the second number:";
        operatorQuestion = "Input one of these operators (+, -, *, /)";

        inputScan = new Scanner(System.in);
        askNumber = new AskNumber(inputScan);
        askOperator = new AskOperator(inputScan);
    }

    public void Inputs(){
        
        System.out.println(numberQuestion1);
        firstNumber = askNumber.AskInput();

        System.out.println(operatorQuestion);
        operator = askOperator.AskInput();

        System.out.println(numberQuestion2);
        secondNumber = askNumber.AskInput();
        
        inputScan.close();
    }

    public int GetFirstNumber(){
        return firstNumber;
    }

    public int GetSecondNumber(){
        return secondNumber;
    }

    public String GetOperator(){
        return operator;
    }
}
