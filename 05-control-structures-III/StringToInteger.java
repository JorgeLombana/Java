// Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero. Utiliza el método Integer.parseInt() para convertir la cadena en un número entero. Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida en un número entero. En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla.

import java.util.Scanner;

public class StringToInteger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Please enter a string convert into an integer: ");
      int parsedNumber = Integer.parseInt(scanner.nextLine());
      System.out.println("The parsed number is: " + parsedNumber);
    } catch (NumberFormatException error) {
      System.out.println("Invalid input, please enter a valid integer.");
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      scanner.close();
    }
  }
}
