/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит три числа.
 * Увеличьте первое число в два раза,
 * второе числа уменьшите на 3,
 * третье число возведите в квадрат и затем найдите сумму новых трех чисел.
 */
package exerciseAndCalculations.simplestArithmetic;

import java.util.Scanner;

public class Task_16 {
    public void task(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number one: ");
        int num_1 = scanner.nextInt();
        System.out.println("Write number two: ");
        int num_2 = scanner.nextInt();
        System.out.println("Write number three: ");
        int num_3 = scanner.nextInt();
        int resultNum_1 = num_1 * 2;
        int resultNum_2 = num_2 - 3;
        int resultNum_3 = (int) Math.pow(num_3,2);
        int result = resultNum_1+resultNum_2+resultNum_3;
        System.out.println("Result one: "+resultNum_1+"\n"
        +"Result two: "+ resultNum_2+"\n"
        +"Result three: "+ resultNum_3+"\n"
        +"Result: "+result);

    }
}
