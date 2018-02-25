/**
 * @author Vadym Doroshevych
 *
 * @task Даны три переменные a, b и c.
 * Изменить значения этих переменных так,
 * чтобы в a хранилось значение a+b,
 * в b хранилась разность старых значений c−a,
 * а в c хранилось сумма старых значений a+b+c.
 * Например, a=0, b=2, c=5, тогда новые значения a=2, b=3 и c=7.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;
import exerciseAndCalculations.scanner.Sc;

public class Task_27 implements Task {

    private int a;

    private int b;

    private int c;

    public Task_27() {
    }

    public Task_27(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void task(){
        System.out.println("Write variable a:");
        a = Sc.scanner.nextInt();
        System.out.println("Write variable b:");
        b = Sc.scanner.nextInt();
        System.out.println("Write variable c:");
        c = Sc.scanner.nextInt();

        int cloneA=a,cloneB=b,cloneC=c;

        a +=cloneB;
        b = cloneC-a;
        c = cloneA+cloneB+cloneC;

        System.out.println("Variable a = "+a+"\nVariable b = "+b+"\nVariable c = "+c);
        Sc.scanner.close();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
