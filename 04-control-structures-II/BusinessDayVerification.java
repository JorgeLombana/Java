// Verificación de Día Hábil
// En este ejercicio, crearás un programa que pedirá al usuario ingresar un número del 1 al 7, representando un día de la semana. El programa determinará si ese día es hábil o no. Se mostrará el resultado en pantalla. Se considera que los días hábiles son del 1 al 5 (de lunes a viernes). Utilizaremos la estructura "switch" para implementar este programa. ( Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes).)

import java.util.Scanner;

public class BusinessDayVerification {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter a number between 1 and 7 to validate whether it is a business day or not: ");
    if (scanner.hasNextInt()) {
      int numberEntered = scanner.nextInt();
      scanner.close();
      if (numberEntered <= 7 && numberEntered >= 1) {
        boolean isBusinessDay = switch (numberEntered) {
          case 1, 2, 3, 4, 5 -> true;
          default -> false;
        };
        System.out.println("That day is" + (isBusinessDay ? " a" : " not a") + " business day.");
      } else {
        System.out.println("The number must be between 1 and 7");
      }
    } else {
      System.out.println("Invalid input, please enter a numeric value.");
    }
  }
}
