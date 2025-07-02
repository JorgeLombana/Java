// Actividad: Resta con Manejo de Excepciones
// Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número menos el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir en caso de que el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta.

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeSubtraction {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Please enter the first number: ");
      int firstNumber = scanner.nextInt();

      System.out.print("Now, the second number: ");
      int secondNumber = scanner.nextInt();

      int result = firstNumber - secondNumber;
      System.out.println("The result is: " + result);
    } catch (InputMismatchException error) {
      System.out.println("Invalid input, please enter an integer number.");
    } catch (Exception error) {
      System.out.println("Error: " + error);
    } finally {
      scanner.close();
    }
  }
}
