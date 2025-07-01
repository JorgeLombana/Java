// Actividad: Creando una calculadora básica
// Después de analizar el funcionamiento del programa requerido en el video proporcionado, tu tarea es escribir el código necesario para cumplir con los siguientes puntos:
// Solicita al usuario que ingrese dos números y almacena estos valores en variables previamente declaradas.
// Declara una variable para almacenar el resultado de la operación. 
// Permite al usuario elegir qué operación quiere realizar.
// Muestra el resultado de la operación en la consola.
// 💡 Recuerda utilizar el operador ternario para simplificar la lógica del programa y optimizar su escritura.

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    int numberOne, numberTwo, operationNumberSelected, result;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter the first number: ");
    numberOne = scanner.nextInt();

    System.out.print("Now, please enter the second number: ");
    numberTwo = scanner.nextInt();

    System.out
        .print(
            "Now, please enter the operation you would like to do:\n  1: sum, 2: rest, 3: division, 4: multiplication: ");
    operationNumberSelected = scanner.nextInt();
    scanner.close();

    result = operationNumberSelected == 1 ? numberOne + numberTwo
        : (operationNumberSelected == 2 ? numberOne - numberTwo
            : (operationNumberSelected == 3 ? numberOne / numberTwo
                : numberOne * numberTwo));

    System.out.println("The result is: " + result);
  }
}
