import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter type of shape: ");
    String type = scanner.nextLine();

    System.out.print("Enter width: ");
    int width = scanner.nextInt();

    System.out.print("Enter height: ");
    int height = scanner.nextInt();

    Shape shape = new Shape(height, width);
    shape.type = type;

    
  }
}
