// Actividad: Division Segura
// Escribe un programa que pida al usuario que ingrese dos números enteros y realice la división del primer número entre el segundo número. Implementa un bloque "try-catch" para manejar la excepción en caso de que se intente realizar una división por cero. En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla.

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivision {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter an integer number: ");
      int firstNumber = scanner.nextInt();

      System.out.print("Enter another integer number: ");
      int secondNumber = scanner.nextInt();
      scanner.close();

      int result = firstNumber / secondNumber;
      System.out.println("The division result is: " + result);
    } catch (ArithmeticException error) {
      System.out.println("It's imposible to divide by 0 ");
    } catch (InputMismatchException error) {
      System.out.println("Invalid input, please enter only integer values.");
    }
  }
}
