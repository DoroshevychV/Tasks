/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит три числа.
 * Увеличьте первое число в два раза,
 * второе числа уменьшите на 3,
 * третье число возведите в квадрат и затем найдите сумму новых трех чисел.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

import java.util.Scanner;

public class Task_16 implements Task {
    @Override
    public void task(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number one: ");
        int num_1 = scanner.nextInt()*2;
        System.out.println("Write number two: ");
        int num_2 = scanner.nextInt()-3;
        System.out.println("Write number three: ");
        int num_3 = (int) Math.pow(scanner.nextInt(),2);
        int sum = num_1+num_2+num_3;
        System.out.println("Result one: "+num_1+"\n"
                +"Result two: "+ num_2+"\n"
                +"Result three: "+ num_3+"\n"
                +"Result: "+sum);
    }
}
