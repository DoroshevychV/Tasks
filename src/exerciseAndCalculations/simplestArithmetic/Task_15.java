/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит число. Выведите на экран квадрат этого числа, куб этого числа.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

import java.util.Scanner;

public class Task_15 implements Task {
    @Override
    public void task(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number:");
        int num_1 = scanner.nextInt();
        double square = Math.pow(num_1,2);
        double cube = Math.pow(num_1,3);
        System.out.println("Square : "+ square);
        System.out.println("Cube : "+ cube);
    }
}
