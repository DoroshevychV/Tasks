/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит время в минутах и
 * расстояние в километрах. Найдите скорость в м/c.
 */
package exerciseAndCalculations.simplestArithmetic;

import java.util.Scanner;

public class Task_20 {
    public void task(){
        Scanner scanner = new Scanner(System.in);
        int time,distance;
        System.out.println("Write time in minutes");
        time = scanner.nextInt();
        System.out.println("Write distance in metres");
        distance = scanner.nextInt();
        double hour = time/60;
        double kilometres = distance/1000;
        System.out.println("Result: \n" + kilometres+"/"+hour);
    }
}
