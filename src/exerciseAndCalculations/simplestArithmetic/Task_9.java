/**
 * @author Vadym Doroshevych
 *
 * @task Вычислите |x|+x^5, если x=−2.
 */
package exerciseAndCalculations.simplestArithmetic;

public class Task_9 {
    public void task(){
        int x = -2;
        int result = (int) (-x + (Math.pow(x,5)));
        System.out.println(result);
    }
}
