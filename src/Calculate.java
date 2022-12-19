public class Calculate {
    private int firstNumber;
    private int secondNumber;
    private int result;

    private String operator;


    public Calculate(int firstNumber, int secondNumber, String operator){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public int Calc(){
        if (operator.equals("+")) {
            result = Add();
        }else if (operator.equals("-")) {
            result = Sub();
        }else if (operator.equals("*")){
            result = Mult();
        }else if (operator.equals("/")) {
            result = Div();
        }
        return result;
    }

    public int Add(){
        result = firstNumber + secondNumber;
        return result;
    }

    public int Sub(){
        result = firstNumber - secondNumber;
        return result;
    }

    public int Mult(){
        result = firstNumber * secondNumber;
        return result;
    }

    public int Div(){
        if (secondNumber != 0) {
            result = firstNumber / secondNumber;
            return result;
        }else{
            System.out.println("Error, Cannot divide by 0");
            return result;
        }
    }
}       
