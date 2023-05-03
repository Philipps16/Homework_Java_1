import java.util.Scanner;
public class Task03 {
   public static void main(String[] args) {
      double number1;
      double number2;
      double result;
      char operation;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      number1 = reader.nextDouble();
      number2 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      operation = reader.next().charAt(0);
      switch(operation) {
         case '+': result = number1 + number2;
            break;
         case '-': result = number1 - number2;
            break;
         case '*': result = number1 * number2;
            break;
         case '/': result = number1 / number2;
            break;
         default:  System.out.printf("Error! Enter correct operationerator");
            return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(number1 + " " + operation + " " + number2 + " = " + result);
   }
}