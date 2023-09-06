package scripts;

import java.util.Scanner;

public class script02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insert your name:"); // input data
            String name = scanner.nextLine();

            System.out.println("Insert your age: "); // input data
            int age = scanner.nextInt();

            System.out.println("My name is " + name + ", and I have " + age + " old years");
        }
    }
}
