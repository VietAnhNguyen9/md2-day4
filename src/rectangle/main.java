package rectangle;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height");
        double height = scanner.nextDouble();
        rectangle rectangle = new rectangle(width,height);
        System.out.println("Area: "+ rectangle.getArea());
        System.out.println("Perimeter: "+ rectangle.getPerimeter());
        System.out.println(rectangle.display());
    }
}
