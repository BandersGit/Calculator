import java.util.Scanner;

public class AskNumber {
    private Scanner inputScan;
    private int number;
    private String parseTest;

    public AskNumber(Scanner inputScan){
        this.inputScan = inputScan;
    }
        
    public int AskInput(){
        do {
            try {
                parseTest = inputScan.nextLine();
                number = Integer.parseInt(parseTest);
                break;
            } catch (Exception e) {
                System.out.println("Not a valid input, please try again");
            }
        } while (true);
        return number;
    }
}
