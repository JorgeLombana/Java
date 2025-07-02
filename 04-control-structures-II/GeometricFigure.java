// Actividad: Selección de Figura Geométrica
// Mediante una estructura switch, desarrollarás un programa que pida al usuario ingresar un número del 1 al 3 para seleccionar una figura geométrica: 1 para círculo, 2 para cuadrado y 3 para triángulo. Después, solicitará al usuario los datos necesarios para calcular el área de la figura seleccionada. Estos datos serán:
// Para el círculo: el radio.
// Para el cuadrado: el lado.
// Para el triángulo: la base y la altura.
// Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada.

import java.util.Scanner;

public class GeometricFigure {
  public static void main(String[] args) {
    int figureSelected;
    double area;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please select an option, 1 for circle, 2 for square, 3 for triangle: ");
    if (scanner.hasNextInt()) {
      figureSelected = scanner.nextInt();
      switch (figureSelected) {
        case 1:
          System.out.print("Please enter the radius of the circle: ");
          if (scanner.hasNextDouble()) {
            double radius = scanner.nextDouble();
            area = Math.PI * Math.pow(radius, 2);
            System.out.printf("The area of the circle is %.2f%n", area);
          }
          break;
        case 2:
          System.out.println("Please enter the side length of the square");
          if (scanner.hasNextDouble()) {
            double squareSide = scanner.nextDouble();
            area = Math.pow(squareSide, 2);
            System.out.printf("The area of the square is %.2f%n", area);
          }
          break;
        case 3:
          System.out.print("Please enter the base of the triangle: ");
          if (scanner.hasNextDouble()) {
            double base = scanner.nextDouble();
            System.out.print("Now, please enter the height of the triangle: ");
            if (scanner.hasNextDouble()) {
              double height = scanner.nextDouble();
              area = (base * height) / 2;
              System.out.printf("The area of the triangle is: %.2f%n", area);
            }
          }
          break;
        default:
          System.out.println("Invalid input, please provide a valid number between 1 and 3.");
          break;
      }
    } else {
      System.out.println("Invalid input. Please enter a numeric value between 1 and 3");
    }
    scanner.close();
  }
}