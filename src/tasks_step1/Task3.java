package tasks_step1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double result = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println(result);
    }
}
