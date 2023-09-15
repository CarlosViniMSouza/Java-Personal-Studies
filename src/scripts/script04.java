package scripts;

import java.util.Scanner;

public class script04 {
    public static void main(String[] args) {
        double x, y, z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite numero de X: ");
        x = scanner.nextDouble();

        System.out.println("Digite numero de Y: ");
        y = scanner.nextDouble();

        z = Math.pow(x, y);

        System.out.println("Resultado final: " + z);
        scanner.close();
    }
}
