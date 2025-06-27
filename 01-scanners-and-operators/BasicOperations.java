// Declara dos variables, y asígnales un valor a cada una de ellas.
// Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, Ej: La suma de las 2 variables es : “[resultado]”;
// Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente declaradas, realiza la suma de los números y muestra el resultado en la consola.

import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "The sum of the variable " + firstNumber + " and the variable " + secondNumber + " is "
                        + (firstNumber + secondNumber));
        System.out.println(
                "The difference of the variable " + firstNumber + " and the variable " + secondNumber + " is "
                        + (firstNumber - secondNumber));
        System.out.println(
                "The division of the variable " + firstNumber + " and the variable " + secondNumber + " is "
                        + (firstNumber / secondNumber));
        System.out.println(
                "The multiplication of the variable " + firstNumber + " and the variable " + secondNumber + " is "
                        + (firstNumber * secondNumber));
        System.out.println(
                "The reminder of the variable " + firstNumber + " and the variable " + secondNumber + " is "
                        + (firstNumber % secondNumber));

        System.out.println("Please enter a number");
        firstNumber = scanner.nextInt();

        System.out.println("Please enter another number");
        secondNumber = scanner.nextInt();
        scanner.close();

        System.out.println(
                "The sum of the numbers entered is " + (firstNumber + secondNumber));
    }
}
