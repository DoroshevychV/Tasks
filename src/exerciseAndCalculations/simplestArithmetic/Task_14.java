/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит два числа. Найдите сумму и произведение данных чисел.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

import java.util.Scanner;

public class Task_14 implements Task {
    @Override
    public void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number one:");
        int num_1 = scanner.nextInt();
        System.out.println("Number two:");
        int num_2 = scanner.nextInt();
        int sum = num_1+num_2;
        int multiplication = num_1*num_2;

        System.out.println("Sum: "+sum);
        System.out.println("Multiplication: "+multiplication);
        System.exit(0);
    }
}
