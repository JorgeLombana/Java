// Estos ejercicios son de tipo complementario. Esto quiere decir que te ayudará a avanzar en profundidad en el tema visto. Te recomendamos intentar con tu equipo trabajar al menos uno de ellos. 
// 1. Verificación de Edad
// Pide al usuario que ingrese su año de nacimiento y almacena el dato en una variable previamente declarada llamada añoNacimiento.
// Declara una variable del tipo Constante llamado ANIOACTUAL con el año actual.
// Calcula la edad actual del usuario, considerando que la cuenta sería ANIOACTUAL - añoNacimiento. Almacena el dato en una variable llamada calculoEdad.
// Determina si el usuario es mayor de edad (tener 18 años o más) y muestra un mensaje apropiado.
// 💡Al declarar la variable del tipo constante, recuerda las convenciones recomendadas para hacerlo.

import java.util.Scanner;

public class ComplementaryActivity001 {
  public static void main(String[] args) {
    int birthYear;
    final int CURRENT_YEAR = 2025;
    int calculatedAge;
    String message;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter your birth year:");
    birthYear = scanner.nextInt();
    scanner.close();

    calculatedAge = CURRENT_YEAR - birthYear;
    message = (calculatedAge >= 18) ? "The user is of legal age" : "The user is a minor";

    System.out.println(message);
  }
}