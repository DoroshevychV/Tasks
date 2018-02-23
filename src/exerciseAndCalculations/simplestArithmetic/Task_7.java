/**
 * @author Vadym Doroshevych
 *
 *@task Вычислите 1/2+1/4. Ответ: 0.75
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

public class Task_7 implements Task{
    @Override
    public void task(){
        double a = 1/2d;
        double b = 1/4d;
        double result = a+b;
        System.out.println("1/2 + 1/4 = "+result);
    }
}
