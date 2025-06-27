// 1. Pide al usuario que ingrese dos números, y:
// A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado.
// B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
// C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.
// 💡Los operadores de comparación más utilizados en Java son: igualdad (==), distinto que (!=), mayor que (>), menor que (<), mayor o igual que (>=), menor o igual que (<=). 
// 2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:
// A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
// B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
// 💡Los operadores lógicos más utilizados en Java son: AND (&&), OR (||), siendo AND = y  / OR = o.

import java.util.Scanner;

public class ComparisonOperators {
  public static void main(String[] args) {
    int numberOne;
    int numberTwo;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the first number");
    numberOne = scanner.nextInt();

    System.out.println("Please enter the second number");
    numberTwo = scanner.nextInt();

    System.out.println(
        "The number " + numberOne + " is greater than " + numberTwo + " = " + (numberOne > numberTwo));
    scanner.close();
    System.out.println(
        "The number " + numberOne + " is different than " + numberTwo + " = " + (numberOne != numberTwo));
    scanner.close();
    System.out.println(
        "The number " + numberOne + " is divisible by " + numberTwo + " = " + (numberOne % numberTwo == 0));

    System.out.println("Please enter another number");
    numberOne = scanner.nextInt();

    System.out.println("Please enter another number again");
    numberTwo = scanner.nextInt();
    scanner.close();

    // A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
// B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
    System.out.println(
      "The number " + numberOne + ""
    );

  }
}
