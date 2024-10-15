import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("type exit to exit, or type any other key to continue: ");
            ArrayList<Double> numberList = new ArrayList<>();
            ArrayList<String> operatorList = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            double sum = numberList.getFirst();

            if (input.nextLine().equals("exit")) {
                break;
            } else {
                while (true) {
                    System.out.println("insert number.");
                    numberList.add(input.nextDouble());

                    System.out.println("insert operator.");
                    String operator = input.next();
                    operatorList.add(operator);
                    if (operatorList.equals("=")) {
                        for (int i = 0; i < operatorList.size(); i++) {
                            switch (operatorList.get(i)) {
                                case "+":
                                    sum += numberList.get(i+1);
                                    break;

                                case "-":
                                    sum -= numberList.get(i+1);
                                    break;

                                case "*":
                                    sum *= numberList.get(i+1);
                                    break;

                                case "/":
                                    sum /= numberList.get(i+1);
                                    break;

                                default:
                                    System.out.println("nut a valid operator");
                            }
                            }

                        }
                        else {
                            operatorList.add(operator);
                            System.out.println(sum);
                            break;
                        }
                    }
                }
            }
        }
    }

