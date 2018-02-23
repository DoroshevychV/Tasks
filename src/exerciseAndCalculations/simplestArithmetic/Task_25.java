/**
 * @author Vadym Doroshevych
 *
 * @task Пользователь вводит количество недель,
 * месяцев, лет и получает количество дней за это время.
 * Считать, что в месяце 30 дней.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;
import exerciseAndCalculations.scanner.Sc;

public class Task_25 implements Task {

    private int weeks;

    private int months;

    private int years;

    private int result;

    public Task_25() {
    }

    public Task_25(int weeks, int months, int years) {
        this.weeks = weeks;
        this.months = months;
        this.years = years;
    }

    @Override
    public void task() {
        System.out.println("Write weeks:");
        this.weeks = Sc.scanner.nextInt();
        System.out.println("Write months:");
        this.months = Sc.scanner.nextInt();
        System.out.println("Write years:");
        this.years = Sc.scanner.nextInt();
        Sc.scanner.close();
        this.result = (weeks * 7)+(months * 30)+(years*365);
        System.out.println("Result: "+result+" days, but if year is leaky - "+(result+1));
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
