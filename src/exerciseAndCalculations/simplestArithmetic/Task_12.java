/**
 * @author Vadym Doroshevych
 *
 * @task Вычислите значение выражения ex−2+|sin(x)|−x^10*cos(1/x)
 * при x=3.6
 */
package exerciseAndCalculations.simplestArithmetic;

public class Task_12 {
    public void task(){
        double x = 3.6;
        double result = Math.exp(x-2)+Math.sin(x)-Math.pow(x,10)*Math.cos(1/x);
        System.out.println(result);
    }
}
