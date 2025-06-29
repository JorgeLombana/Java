// 2. Calculadora de Área y Perímetro:
// Pide al usuario que ingrese el valor de la base y de la altura de un rectángulo.
// Almacena estos valores en variables previamente declaradas llamadas baseRectangulo y alturaRectangulo, respectivamente.
// Calcula y almacena el perímetro del rectángulo utilizando la fórmula: Perímetro = 2 × base + 2 × altura.
// Muestra el resultado del perímetro por consola junto con un mensaje adecuado.
// Calcula y almacena el área del rectángulo utilizando la fórmula: Área = base × altura.
// Muestra el resultado del área por consola junto con un mensaje adecuado.
// 💡 Recuerda: Al declarar las variables, ten en cuenta si los valores ingresados por el usuario pueden ser decimales. En tal caso, debes utilizar variables de tipo flotante o doble para garantizar una precisión decimal adecuada.

import java.util.Scanner;

public class ComplementaryActivity002 {
  public static void main(String[] args) {
    float rectangleBase, rectangleHeight, perimeter, area;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the base of the rectangle: ");
    rectangleBase = scanner.nextFloat();

    System.out.println("Now, please enter the height of the rectangle: ");
    rectangleHeight = scanner.nextFloat();
    scanner.close();

    perimeter = ((2 * rectangleBase) + (2 * rectangleHeight));
    System.out.println("The rectangle perimeter is : " + perimeter);

    area = rectangleBase * rectangleHeight;
    System.out.println("The rectangle area is: " + area);
  }
}
