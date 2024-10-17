import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while(true) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the equation for calculation, or type 'exit' to quit: ");
        String equation = sc.nextLine();
        if(equation.equals("exit")) {
            break;
        }
        double sum = 0;
        double tempNum = 0.0;
        double parenthesesNum = 0.0;
        for (int i = 0; i < equation.length(); i++) {
            if (Character.isDigit(equation.charAt(i))) {
                tempNum = Double.parseDouble(equation.charAt(i) + "");

            }
            else if (equation.charAt(i) == '+' || equation.charAt(i) == '-' || equation.charAt(i) == '*' || equation.charAt(i) == '/') {
            switch (equation.charAt(i)) {
                case '+' -> sum += tempNum;
                case '-' -> sum -= tempNum;
                case '*' -> tempNum *= tempNum;
                case '/' -> tempNum /= tempNum;

            }
            }
        }

        System.out.println(sum);
        }
    }
}