// ✏️  Actividad: Ejercicio de Días de la Semana
// En esta actividad, escribirás un programa que solicite al usuario ingresar un número del 1 al 7, que representará un día de la semana. Luego, el programa mostrará en pantalla el nombre correspondiente a ese día. Utilizaremos la estructura "switch" para implementar este programa.

import java.util.Scanner;

public class DaysOfTheWeek {
  public static void main(String[] args) {
    int number;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter a number from 1 to 7: ");
    number = scanner.nextInt();
    scanner.close();

    switch (number) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid input. Please enter a number between 1 and 7.");
    }
  }
}
