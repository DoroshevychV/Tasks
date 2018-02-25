/**
 * @author Vadym Doroshevych
 * @task Поменяйте местами значения двух переменных,
 * не используя дополнительных переменных.
 */
package exerciseAndCalculations.simplestArithmetic;

import exerciseAndCalculations.Task;
import exerciseAndCalculations.scanner.Sc;

import java.util.Scanner;

public class Task_29 implements Task {

    private int numberOne;

    private int numberTwo;

    public Task_29() {
    }

    public Task_29(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    @Override
    public void task() {

        System.out.println("Write number one: ");
        this.numberOne = Sc.scanner.nextInt();
        System.out.println("Write number two: ");
        this.numberTwo = Sc.scanner.nextInt();
        Sc.scanner.close();

        numberOne = numberOne + numberTwo - (numberTwo = numberOne);

        System.out.println("Number one = "+numberOne);
        System.out.println("Number two = "+numberTwo);

    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }
}
