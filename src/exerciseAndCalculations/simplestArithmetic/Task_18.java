/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит сторону квадрата.
 * Найдите периметр и площадь квадрата.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

import java.util.Scanner;

public class Task_18 implements Task {
    @Override
    public void task(){
        Scanner scanner = new Scanner(System.in);
        int side,perimeter,area;
        System.out.println("Write length of the side of the square(integer)");
        side = scanner.nextInt();
        perimeter= side*4;
        area = side*side;
        System.out.println("Perimeter = "+perimeter+"\n" +
                "Area = "+ area);
    }
}
