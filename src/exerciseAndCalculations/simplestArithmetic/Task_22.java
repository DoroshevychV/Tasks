/**
 * @author Vadym Doroshevych
 *
 * @task Дано значение температуры в градусах Цельсия.
 * Вывести температуру  в градусах Фаренгейта.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

import java.util.Scanner;

public class Task_22 implements Task{
    @Override
    public void task(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write temperature in Celsius: ");
        String scValue = scanner.next();
        double celsius = Double.parseDouble(scValue);
        double fahrenheit = (celsius * ((double) 9/5))+32;
        System.out.println(fahrenheit+" °F");
    }
}
