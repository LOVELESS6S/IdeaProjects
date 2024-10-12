import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
     double sum;
     double num1;
     double num2;
     while(true){
         System.out.print("type exit to exit, or type any other key to continue: ");
         Scanner input = new Scanner(System.in);
         if (input.nextLine().equals("exit")){
             break;
         }

         else{
             System.out.print("Enter number 1: ");
             num1 = input.nextDouble();
             System.out.print("Enter number 2: ");
             num2 = input.nextDouble();

             input.nextLine();


             System.out.print("type in the desired operation: ");
             String operation = input.nextLine();
             switch (operation){
                 case "+" : sum = num1 + num2;
                 System.out.println(sum);
                 break;

                 case "-" : sum = num1 - num2;
                 System.out.println(sum);
                 break;

                 case "*" : sum = num1 * num2;
                 System.out.println(sum);
                 break;

                 case "/" : sum = num1 / num2;
                 System.out.println(sum);
                 break;

                 default: System.out.println("Invalid operation");
             }
         }
     }


           }
}