/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит три числа.
 * Найдите среднее арифметическое этих чисел,
 * а также разность удвоенной суммы первого и третьего чисел и утроенного второго числа.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

import java.util.Scanner;

public class Task_17 implements Task {
    @Override
    public void task(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number one: ");
        int num_1 = scanner.nextInt();
        System.out.println("Write number two: ");
        int num_2 = scanner.nextInt();
        System.out.println("Write number three: ");
        int num_3 = scanner.nextInt();

        int arithmeticMean = (num_1+num_2+num_3)/3;
        int dif = 2 * (num_1 + num_2) - 3 * num_3;
        System.out.println("Result one: "+arithmeticMean+"\n"
                +"Result two: "+dif);
    }
}
