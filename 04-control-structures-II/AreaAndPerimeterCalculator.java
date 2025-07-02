// Calculadora de Área y Perímetro:
// Implementando el uso de la estructura "switch expression", solicita al usuario que elija entre una de las siguientes dos figuras geométricas:
// Opción 1: "Circulo"
// Opción 2: "Rectangulo"
// Según la figura seleccionada, deberás solicitar que ingrese los valores necesarios para calcular el área o el perímetro de cada figura:
// Para el Círculo: Solicita el valor del radio, ya que PI es una constante.
// Para el Rectángulo: Solicita el valor de la base y de la altura.
// Dentro de la opción elegida, permite al usuario seleccionar si desea conocer el área o el perímetro de dicha figura.
// Realiza los cálculos necesarios y muestra el resultado por consola junto con un mensaje adecuado.

// !Important: I'm not allowed to use methods yet :c

import java.util.Scanner;

public class AreaAndPerimeterCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please select an option: 1 for circle or 2 for rectangle: ");
    if (scanner.hasNextInt()) {
      int figureSelected = scanner.nextInt();
      switch (figureSelected) {
        case 1 -> {
          System.out.print("Now, please enter the radius: ");
          double radius = 0;
          if (scanner.hasNextDouble()) {
            radius = scanner.nextDouble();
          } else {
            System.out.println("Invalid input, please enter a double value.");
            break;
          }
          System.out.print("Select one option: 1 for area, 2 for perimeter: ");
          if (scanner.hasNextInt()) {
            int areaOrPerimeter = scanner.nextInt();
            if (areaOrPerimeter != 1 && areaOrPerimeter != 2) {
              System.out.println("Invalid option, please select a number between 1 and 2");
              break;
            } else {
              switch (areaOrPerimeter) {
                case 1 -> {
                  double circleArea = Math.PI * Math.pow(radius, 2);
                  System.out.printf("The area of the circle is: %.2f%n", circleArea);
                }
                case 2 -> {
                  double circlePerimeter = (2 * Math.PI * radius);
                  System.out.printf("The perimeter of the circle is %.2f%n", circlePerimeter);

                }
                default -> System.out.println("Invalid option");
              }
            }
          } else {
            System.out.println("Invalid input, please enter a numeric value.");
          }
        }
        case 2 -> {
          System.out.print("Now, please enter the base: ");
          double base = 0;
          if (scanner.hasNextDouble()) {
            base = scanner.nextDouble();
          } else {
            System.out.println("Invalid input, please enter a numeric value.");
            break;
          }
          System.out.print("Now, please enter the height: ");
          double height = 0;
          if (scanner.hasNextDouble()) {
            height = scanner.nextDouble();
          } else {
            System.out.println("Invalid input, please enter a numeric value.");
            break;
          }

          System.out.print("Select one option: 1 for area, 2 for perimeter: ");
          if (scanner.hasNextInt()) {
            int areaOrPerimeter = scanner.nextInt();
            if (areaOrPerimeter != 1 && areaOrPerimeter != 2) {
              System.out.println("Invalid option, please select a number between 1 and 2");
              break;
            } else {
              switch (areaOrPerimeter) {
                case 1 -> {
                  double rectangleArea = base * height;
                  System.out.printf("The area of the rectangle is: %.2f%n", rectangleArea);
                }
                case 2 -> {
                  double rectanglePerimeter = 2 * (base + height);
                  System.out.printf("The perimeter of the rectangle is %.2f%n", rectanglePerimeter);
                }
                default -> System.out.println("Invalid option");
              }
            }

          } else {
            System.out.println("Invalid input, please enter a numeric value.");
          }
        }

        default -> System.out.println("Please enter a number between 1 and 2.");
      }
    } else {
      System.out.println("Invalid input, enter a numeric value.");
    }
    scanner.close();
  }
}