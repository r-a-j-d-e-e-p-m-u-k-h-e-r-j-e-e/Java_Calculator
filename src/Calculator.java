import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an arithmetic operator: +, -, *, or / here: ");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter the first number: ");
    number1 = input.nextDouble();

    System.out.println("Enter the second number: ");
    number2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println("The Sum of " + number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println("The Difference of " + number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println("The Product of " + number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println("The Quotient of " + number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator! Please Try Again.");
        break;
    }

    input.close();
  }
}