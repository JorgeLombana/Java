// En esta actividad, deberás escribir un programa que solicite al usuario un número y determine si es positivo, negativo o cero. El resultado se mostrará en pantalla.

import java.util.Scanner;

public class NumberClassification {

  public static void main(String[] args) {
    int number;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter an integer number: ");
    number = scanner.nextInt();
    scanner.close();

    if (number > 0) {
      System.out.println("The number is positive.");
    } else if (number < 0) {
      System.out.println("The number is negative.");
    } else {
      System.out.println("The number is 0.");
    }
  }
}
