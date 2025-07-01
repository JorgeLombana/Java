// En esta actividad, escribirás un programa que solicite al usuario un número y determine si es divisible por 5, por 3, por ambos o por ninguno. El resultado se mostrará en pantalla.

import java.util.Scanner;

public class DivisibleBy {
  public static void main(String[] args) {
    int number;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number to check whether it is divisible by 3, 5, both or neither");
    number = scanner.nextInt();
    scanner.close();

    if (number % 5 == 0 && number % 3 == 0) {
      System.out.println("The number is divisible by both 5 & 3.");
    } else if (number % 5 == 0) {
      System.out.println("The number is divisible by 5.");
    } else if (number % 3 == 0) {
      System.out.println("The number is divisible by 3.");
    } else {
      System.out.println("The number isn't divisible by 3 or 5.");
    }
  }
}
