/**
 * @uathor Vadym Doroshevych
 * @task Вывести на экран результат вычисления 1+2−4.
 */
package exerciseAndCalculations.workingWithTheСonsole;

import exerciseAndCalculations.Task;

public class Task_6 implements Task {
    @Override
    public void task(){
        System.out.println("1+2-4 = "+((1+2)-4));
    }
}
