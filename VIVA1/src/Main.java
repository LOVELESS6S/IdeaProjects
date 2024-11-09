import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int step = 0;
    while (n != 1){
        if ((n / b ) < (n - a) && (n % b) == 0) {
            step++;
            System.out.printf("n = %d, divisible by %d:%n divide by %d, n = %d, steps = %d%n", n, b, b, (n/b), step);
            n = n / b;
        }
        else {
            step++;
            System.out.printf("n = %d, indivisible by %d or not the most effective way to reduce n to 1:%n %d minus %d, n = %d, steps = %d%n", n, b, n, a, (n -a ), step);
            n = n - a;
        }

        if( n <= 0){
            System.out.println("because the number is smaller or euqal to zero, which means that it is impossible to reach 1, so the steps will be -1.");
            break;
        }
    }

    }
    }