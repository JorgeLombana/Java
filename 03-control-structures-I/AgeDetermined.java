// 3. Determinación de Edades
// En este ejercicio, desarrollarás un programa que solicite al usuario su edad y determine en qué categoría se encuentra. Las categorías son las siguientes:
// Si la edad es menor de 18 años, mostrar el mensaje "Eres menor de edad".
// Si la edad está entre 18 y 64 años (inclusive), mostrar el mensaje "Eres adulto".
// Si la edad es igual o mayor a 65 años, mostrar el mensaje "Eres un adulto mayor".
// El programa deberá mostrar el mensaje correspondiente según la categoría de edad en la que se encuentre el usuario.

import java.util.Scanner;

public class AgeDetermined {
  public static void main(String[] args) {
    int age;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter your age (0 to 100): ");
    age = scanner.nextInt();
    scanner.close();

    if (age < 0 || age > 100) {
      System.out.println("Please enter a valid age.");
    } else if (age < 18) {
      System.out.println("You are a minor.");
    } else if (age >= 18 && age <= 64) {
      System.out.println("You're an adult.");
    } else {
      System.out.println("You are a senior adult.");
    }
  }
}
