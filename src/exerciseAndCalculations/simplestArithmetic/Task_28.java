/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит сумму вклада в банк и годовой процент.
 * Найдите сумму вклада через 5 лет (рассмотреть два способа начисления процентов)
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;

public class Task_28 implements Task {

    private double percent;

    private double sum;

    private double resultOne;

    private double resultTwo;

    public Task_28() {
    }

    public Task_28(double percent, double sum) {
        this.percent = percent;
        this.sum = sum;
    }

    @Override
    public void task() {
        System.out.println();
    }
}
