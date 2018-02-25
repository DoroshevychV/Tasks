/**
 * @author Vadym Doroshevych
 * @task Пользователь вводит сумму вклада в банк и годовой процент.
 * Найдите сумму вклада через 5 лет (рассмотреть два способа начисления процентов)
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;
import exerciseAndCalculations.scanner.Sc;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
        System.out.println("Write percent: ");
        this.percent = Sc.scanner.nextDouble();
        System.out.println("Write sum: ");
        this.sum = Sc.scanner.nextDouble();

        this.resultOne = sum * (365*5) * (percent / (100 * 365));
        System.out.println("Simple percent after five years = " + (resultOne + sum));

        Sc.scanner.close();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                switch (j) {
//                    "January"
                    case 0:
                        this.resultTwo += (sum + resultTwo) * 31 * (percent / (100 * 365));
                        break;
//                    "February"
                    case 1:
                        this.resultTwo += (sum + resultTwo) * 28 * (percent / (100 * 365));
                        break;
//                    "March"
                    case 2:
                        this.resultTwo += (sum + resultTwo) * 31 * (percent / (100 * 365));
                        break;
//                    "April"
                    case 3:
                        this.resultTwo += (sum + resultTwo) * 30 * (percent / (100 * 365));
                        break;
//                    "May"
                    case 4:
                        this.resultTwo += (sum + resultTwo) * 31 * (percent / (100 * 365));
                        break;
//                    "June"
                    case 5:
                        this.resultTwo += (sum + resultTwo) * 30 * (percent / (100 * 365));
                        break;
//                    "July"
                    case 6:
                        this.resultTwo += (sum + resultTwo) * 31 * (percent / (100 * 365));
                        break;
//                    "August"
                    case 7:
                        this.resultTwo += (sum + resultTwo) * 31 * percent / (100 * 365);
                        break;
//                    "September"
                    case 8:
                        this.resultTwo += (sum + resultTwo) * 30 * percent / (100 * 365);
                        break;
//                     "October"
                    case 9:
                        this.resultTwo += (sum + resultTwo) * 31 * percent / (100 * 365);
                        break;
//                     "November"
                    case 10:
                        this.resultTwo += (sum + resultTwo) * 30 * percent / (100 * 365);
                        break;
//                     "December"
                    case 11:
                        this.resultTwo += (sum + resultTwo) * 31 * percent / (100 * 365);
                        break;
                }
            }
        }
        System.out.println("Complex interest rates(capitalization period (month)) = " + (resultTwo + sum));
        System.out.println("\n" +
                "The results are calculated without taking into account the leap year");
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getResultOne() {
        return resultOne;
    }

    public void setResultOne(double resultOne) {
        this.resultOne = resultOne;
    }

    public double getResultTwo() {
        return resultTwo;
    }

    public void setResultTwo(double resultTwo) {
        this.resultTwo = resultTwo;
    }

}
