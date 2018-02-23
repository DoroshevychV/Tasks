/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит количество дней,
 * указывает процент скидки и вводит сумму.
 * Рассчитать прибыль, если за каждый день сумма увеличивается на 3$
 * и затем применяется скидка, то есть итоговая сумма еще увеличивается на данное число процентов.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;
import exerciseAndCalculations.scanner.Sc;

public class Task_24 implements Task{

    private int days;

    private double percentOfDiscount;

    private double sum;

    private double result;

    public Task_24() {
    }

    public Task_24(int days, double percentOfDiscount, double sum) {
        this.days = days;
        this.percentOfDiscount = percentOfDiscount;
        this.sum = sum;
    }

    @Override
    public void task(){
        System.out.println("Write days: ");
        this.days = Sc.scanner.nextInt();
        System.out.println("Write percent of discount: ");
        this.percentOfDiscount = Sc.scanner.nextDouble();
        System.out.println("Write sum: ");
        this.sum = Sc.scanner.nextDouble();

        this.sum+=3*days;
        this.result = (sum*(percentOfDiscount/100)+sum);

        System.out.println("Result: "+result);
        Sc.scanner.close();

    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPercentOfDiscount() {
        return percentOfDiscount;
    }

    public void setPercentOfDiscount(double percentOfDiscount) {
        this.percentOfDiscount = percentOfDiscount;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
