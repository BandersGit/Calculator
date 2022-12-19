

public class App {
    public static void main(String[] args) throws Exception {
        InputHandler getInputs = new InputHandler();
        getInputs.Inputs();

        Calculate calc = new Calculate(getInputs.GetFirstNumber(), getInputs.GetSecondNumber(), getInputs.GetOperator());

        System.out.println("The result is: " + calc.Calc());
    }
}
