package exerciseAndCalculations.simplestArithmetic;
/**
 * @author Vadym Doroshevych
 *
 * @task Даны две переменных с некоторыми значениями.
 * Поменять местами значения этих переменных
 */
import exerciseAndCalculations.Task;
import exerciseAndCalculations.scanner.Sc;

public class Task_26 implements Task {

    private String varOne;

    private String varTwo;

    private String varThree;

    public Task_26() {
    }

    public Task_26(String varOne, String varTwo) {
        this.varOne = varOne;
        this.varTwo = varTwo;
    }

    @Override
    public void task() {
        System.out.println("Write var one:");
        varOne = Sc.scanner.next();
        System.out.println("Write var two:");
        varTwo = Sc.scanner.next();

        varThree = varOne;
        varOne = varTwo;
        varTwo = varThree;
        varThree = null;

        System.out.println("var one = "+varOne+"\nvar two = "+varTwo);
        Sc.scanner.close();
    }

    public String getVarOne() {
        return varOne;
    }

    public void setVarOne(String varOne) {
        this.varOne = varOne;
    }

    public String getVarTwo() {
        return varTwo;
    }

    public void setVarTwo(String varTwo) {
        this.varTwo = varTwo;
    }

    public String getVarThree() {
        return varThree;
    }

    public void setVarThree(String varThree) {
        this.varThree = varThree;
    }
}
