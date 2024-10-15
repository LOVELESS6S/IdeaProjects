import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Type 'exit' to exit, or type any other key to continue: ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            ArrayList<Double> numberList = new ArrayList<>();
            ArrayList<String> operatorList = new ArrayList<>();

            System.out.println("Insert the first number:");
            numberList.add(input.nextDouble()); // Add the first number

            while (true) {
                System.out.println("Insert operator (+, -, *, /) or '=' to calculate:");
                String operator = input.next();

                if (operator.equals("=")) {
                    break;
                } else if (operator.matches("[+\\-*/]")) {
                    operatorList.add(operator);

                    System.out.println("Insert the next number:");
                    numberList.add(input.nextDouble());
                } else {
                    System.out.println("Not a valid operator. Please enter +, -, *, / or =.");
                }
            }


            double sum = numberList.getFirst();
            for (int i = 0; i < operatorList.size(); i++) {
                switch (operatorList.get(i)) {
                    case "+":
                        sum += numberList.get(i + 1);
                        break;
                    case "-":
                        sum -= numberList.get(i + 1);
                        break;
                    case "*":
                        sum *= numberList.get(i + 1);
                        break;
                    case "/":
                        sum /= numberList.get(i + 1);
                        break;
                }
            }

            System.out.println("Result: " + sum);
            input.nextLine();
        }

        input.close();
    }
}
