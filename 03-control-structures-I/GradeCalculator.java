// En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:
// Si la puntuación está entre 90 y 100, se mostrará "A".
// Si la puntuación está entre 80 y 89, se mostrará "B".
// Si la puntuación está entre 70 y 79, se mostrará "C".
// Si la puntuación está entre 60 y 69, se mostrará "D".
// Si la puntuación es menor a 60, se mostrará "F".
// Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario que el número ingresado está fuera del rango válido.
// El programa mostrará en la consola el valor de la calificación obtenida.
// Realiza varias pruebas de tu programa, para asegurarte que la lógica implementada sea la correcta. 

import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    int grade;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter your grade (from 0 to 100): ");
    grade = scanner.nextInt();
    scanner.close();

    if (grade < 0 || grade > 100) {
      System.out.println("The number entered is out of the valid range.");
    } else if (grade >= 90) {
      System.out.println("Your grade is: A");
    } else if (grade >= 80 && grade < 90) {
      System.out.println("Your grade is: B");
    } else if (grade >= 70 && grade < 80) {
      System.out.println("Your grade is: C");
    } else if (grade >= 60 && grade < 70) {
      System.out.println("Your grade is: D");
    } else {
      System.out.println("Your grade is: F");
    }
  }
}
