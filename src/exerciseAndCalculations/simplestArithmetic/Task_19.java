/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит цены 1 кг конфет и 1 кг печенья.
 * Найдите стоимость:
 * а) одной покупки из 300 г конфет и 400 г печенья;
 * б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

import java.util.Scanner;

public class Task_19 implements Task {
    @Override
    public void task(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write price of candy(kg): ");
        int priceOfCandy = scanner.nextInt();
        System.out.println("Write price of a cookie(kg): ");
        int priceOfCookie = scanner.nextInt();
        double optionOne = (priceOfCandy*0.3)+(priceOfCookie*0.4);
        double optionTwo = ((priceOfCandy*1.8)+(priceOfCookie*2));
        System.out.println("Results: \n" +
                "a) "+optionOne + " UAH\n" +
                "б) "+optionTwo + " UAH");

    }
}
