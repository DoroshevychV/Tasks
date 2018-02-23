/**
 * @author Vadym Doroshevych
 *
 * @task Вычислите значение выражения ((x^2+b)^(1/5)) - ((b^2*sin^3(x+a))/x) при a=0.1, b=0.2 и x=1
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

public class Task_13 implements Task{
    @Override
    public void task(){
        double a = 0.1d;
        double b = 0.2d;
        int x = 1;
        //step one : (x^2+b)^(1/5)
        double step_1 = Math.pow(Math.pow(x,2)+b,(double)1/5);
        //step two : b^2
        double step_2 = Math.pow(b,2);
        //step three : sin^3(x+a)
//        double step_3 = ((3*Math.sin(x+a))-(Math.sin(3*(x+a))))/4;
        double step_3 = Math.pow(Math.sin(x+a),3);
        //step fourth : (step two * step three)/x
        double step_4 = (step_2*step_3)/x;
        //step five : step_1-step_4
        double result = step_1-step_4;
        System.out.println(result);
    }
}
