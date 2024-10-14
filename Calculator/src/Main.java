import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double sum;
        while (true) {
            System.out.print("type exit to exit, or type any other key to continue: ");
            ArrayList<Double> numberList = new ArrayList<Double>();
            ArrayList<String> operatorList = new ArrayList<String>();
            Scanner input = new Scanner(System.in);

            if (input.nextLine().equals("exit")) {
                break;
            } else {
                while (true) {
                    System.out.println("insert number.");
                    numberList.add(input.nextDouble());

                    System.out.println("insert operator.");
                    operatorList.add(input.next());

                    if (input.next().equals("=")) {
                        break;
                    }
                }
            }
        }
    }
}
