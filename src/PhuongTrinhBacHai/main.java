package PhuongTrinhBacHai;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        PhuongTrinhBacHai ptbh = new PhuongTrinhBacHai(a,b,c);
        if (ptbh.getDiscriminant() == 0) {
            System.out.println(ptbh.getRoot4());
        }else if (ptbh.getDiscriminant() < 0) {
            System.out.println(ptbh.getRoot3());
        }else {
            System.out.println(ptbh.getRoot1() + ptbh.getRoot2());
        }


    }

}
