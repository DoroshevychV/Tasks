/**
 * @author Vadym Doroshevych
 * @task Дано число a.
 * Не пользуясь никакими арифметическими
 * операциями кроме умножения, получите
 * а)a^4 за две операции;
 * б)a^6 за три операции;
 * в)a^15 за пять операций.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;
import exerciseAndCalculations.scanner.Sc;

public class Task_30 implements Task{

    private int a;

    private int resultOne;

    private int resultTwo;

    private int resultThree;

    public Task_30() {
    }

    public Task_30(int a) {
        this.a = a;
    }

    @Override
    public void task() {
        System.out.println("Write number 'a':");
        this.a = Sc.scanner.nextInt();
        Sc.scanner.close();
        resultOne = a*a;
        resultOne = resultOne*resultOne;
        System.out.println("Result one(a^4) = "+resultOne);
        resultTwo = a*a;
        resultTwo =resultTwo*a;
        resultTwo =resultTwo*resultTwo;
        System.out.println("Result two(a^6) = "+resultTwo);
        resultThree = a*a;
        resultThree = resultThree*a;
        resultThree = resultThree*a;
        resultThree = resultThree*a;
        resultThree *= resultThree*resultThree;
        System.out.println("Result three(a^15) = "+resultThree);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getResultOne() {
        return resultOne;
    }

    public void setResultOne(int resultOne) {
        this.resultOne = resultOne;
    }

    public int getResultTwo() {
        return resultTwo;
    }

    public void setResultTwo(int resultTwo) {
        this.resultTwo = resultTwo;
    }

    public int getResultThree() {
        return resultThree;
    }

    public void setResultThree(int resultThree) {
        this.resultThree = resultThree;
    }
}
