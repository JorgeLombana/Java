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
        int numberThree;
        int numberFour;

        boolean isGreater;
        boolean isDifferent;
        boolean isDivisibleByTwo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        numberOne = scanner.nextInt();
        System.out.println("Please enter the second number:");
        numberTwo = scanner.nextInt();

        isGreater = numberOne > numberTwo;
        isDifferent = numberOne != numberTwo;
        isDivisibleByTwo = numberOne % 2 == 0;

        System.out.println(
                "Number " + numberOne + " is greater than " + numberTwo + " = " + isGreater);
        System.out.println(
                "Number " + numberOne + " is different from " + numberTwo + " = " + isDifferent);
        System.out.println(
                "Number " + numberOne + " is divisible by 2 ? = " + isDivisibleByTwo);

        System.out.println("Please enter the third number:");
        numberThree = scanner.nextInt();
        System.out.println("Please enter the fourth number:");
        numberFour = scanner.nextInt();
        scanner.close();

        System.out.println(
                "Number " + numberOne + " is greater than number " + numberTwo + " and number "
                        + numberThree
                        + " is greater than " + numberFour + "?  === "
                        + (numberOne > numberTwo && numberThree > numberFour));
        System.out.println(
                "Number " + numberOne + " is greater than number " + numberTwo + " or number " + numberThree
                        + " is greater than " + numberFour + "?  === "
                        + (numberOne > numberTwo || numberThree > numberFour));
    }
}
