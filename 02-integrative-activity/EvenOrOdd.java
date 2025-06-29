// Solicita al usuario que ingrese un número y almacena este valor en una variable.
// Desarrolla un programa que determine si el número ingresado es par o impar.
// Muestra el resultado en la consola.
// Recuerda utilizar el operador ternario para simplificar la lógica del programa y optimizar su escritura.

import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    String isEvenOrOdd;
    int userNumber;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter a random number: ");
    userNumber = scanner.nextInt();
    scanner.close();

    isEvenOrOdd = (userNumber % 2 == 0) ? "even" : "odd";
    System.out.println("The number " + userNumber + " is " + isEvenOrOdd + ".");
  }
}
