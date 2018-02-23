/**
 * @author Vadym Doroshevych
 *
 * @task Вычислите значение выражения (x+1)^2+3(x+1) при
 * а) x=1.7; б) x=3. Ответ: а) 15.39 б) 28
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

public class Task_10 implements Task {
    @Override
    public void task(){
        double x= 1.7d;
        double pow = Math.pow((x+1),2);
        float result = (float) (pow + 3 * (x + 1));
        System.out.println("Option a) "+result);

        System.out.println();

        x = 3;
        pow = Math.pow((x+1),2);
        System.out.println("Option b) "+(int) (pow + 3 * (x + 1)));



    }
}
