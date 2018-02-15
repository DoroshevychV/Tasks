/**
 * @author Vadym Doroshevych
 *
 * @task Даны катеты прямоугольного треугольника.
 * Найдите площадь, периметр и гипотенузу треугольника.
 */
package exerciseAndCalculations.simplestArithmetic;

import java.util.Scanner;

public class Task_21 {

    public void task(){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Write katet one: ");
        a = scanner.nextInt();
        System.out.println("Write katet two: ");
        b = scanner.nextInt();
        double perimeter,area,hypotenuse;
        hypotenuse = Math.sqrt(a*a+b*b);
        area = ((double)1/2)*a*b;
        perimeter = a+b+hypotenuse;
        System.out.println(a);
        System.out.println("Hypotenuse = "+hypotenuse);
        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);

    }
}
