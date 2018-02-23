/**
 * @author Vadym Doroshevych
 *
 * @task Вычислите значение выражения (|X−5|−sinX)/3+√(X^2+2014)cos2X−3 при
 * X=−2.34. Ответ: -1.76911
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

public class Task_11 implements Task {
    @Override
    public void task(){
        float x = -2.34f;
        //first step: (|X−5|−sinX)/3
        float firstStep = (float) ((-(x-5) - (Math.sin(x)))/3);
        //second step: √(X2+2014)*cos2*X−3
        float secondStep = (float) (Math.sqrt((Math.pow(x,2)+2014))*(Math.cos(2*x))-3);
        //third step: firstStep + secondStep
        float result = firstStep + secondStep;
        String formattedFloat = String.format("%.5f", result);
        System.out.println(formattedFloat);

    }
}
