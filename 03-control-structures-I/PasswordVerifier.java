// 1. Verificación de Contraseña:
// En este ejercicio, escribirás un programa que pida al usuario una contraseña y verificará si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, se mostrará un mensaje de "Acceso concedido". En caso contrario, se mostrará un mensaje de "Acceso denegado".

import java.util.Scanner;

public class PasswordVerifier {
  public static void main(String[] args) {
    String password = "abcd1234";
    String enteredPassword;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter the password: ");
    enteredPassword = scanner.nextLine().trim();
    scanner.close();

    if (password.equals(enteredPassword)) {
      System.out.println("Access granted.");
    } else {
      System.out.println("Access denied.");
    }
  }
}
