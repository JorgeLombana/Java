// En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:
// Opción 1: "Guardar"
// Opción 2: "Cargar"
// Opción 3: "Salir"
// El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar una opción. 
// Utilizarás la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje correspondiente a la opción seleccionada.

import java.util.Scanner;

public class SelectAnOption {
  public static void main(String[] args) {
    int option = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter an option (1 to 3): ");
    if (scanner.hasNextInt()) {
      option = scanner.nextInt();
    }
    scanner.close();

    String optionSelected = switch (option) {
      case 1 -> "Save";
      case 2 -> "Load";
      case 3 -> "Exit";
      default -> "Invalid input, please enter a number between 1 and 3.";
    };

    System.out.println(optionSelected);
  }
}
