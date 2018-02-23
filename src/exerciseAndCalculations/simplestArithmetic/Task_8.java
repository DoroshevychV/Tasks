/**
 * @author Vadym Doroshevych
 *
 * @task Вычислите значение выражения
 * (a+4b)(a−3b)+a^2 при a=2 и b=3. Ответ:  -94
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

public class Task_8 implements Task{
    @Override
    public void task(){
        int a=2,b=3;
        int result = (int) ((a+(4*b))*(a-(3*b))+(Math.pow(a, 2)));
        System.out.println(result);
    }
}
