
// Para entender mejor el concepto de esta clase, practicarás con los siguientes ejercicios: 
// Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..
// Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..
// Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.
import java.util.Scanner;

public class ScannerClass {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter your name");
    String userName = scanner.nextLine();

    System.out.println("Now, please enter your age");
    Number userAge = scanner.nextInt();
    scanner.close();

    System.out.println("Your name is " + userName + " and you have " + userAge + " years old");
  }
}