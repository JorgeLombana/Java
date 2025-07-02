// ✏️  Actividad: Conversión de Calificaciones
// En esta actividad, desarrollarás un programa que solicitará al usuario ingresar una calificación numérica del 1 al 5. Luego, mostrará en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:
// 1: "Muy deficiente"
// 2: "Deficiente"
// 3: "Suficiente"
// 4: "Notable"
// 5: "Sobresaliente"

import java.util.Scanner;

public class GradeConversion {
  public static void main(String[] args) {
    int grade;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter your numeric grade from 1 to 5");
    grade = scanner.nextInt();
    scanner.close();

    switch (grade) {
      case 1:
        System.out.println("Very poor");
        break;
      case 2:
        System.out.println("Poor");
        break;
      case 3:
        System.out.println("Enough");
        break;
      case 4:
        System.out.println("Notable");
        break;
      case 5:
        System.out.println("Outstanding");
        break;
      default:
        System.out.println("Invalid input. please enter a valid number (1 to 5).");
    }
  }
}
