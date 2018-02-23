/**
 * @uathor Vadym Doroshevych
 * @task Вывести на экран букву "W" из символов "*" (звездочка).
 */
package exerciseAndCalculations.workingWithTheСonsole;

import exerciseAndCalculations.Task;

public class Task_5 implements Task{
    @Override
    public void task() {
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                System.out.print("*     *     *");
            } else if (i == 1) {
                System.out.print(" *   * *   *");
            }else if (i == 2) {
                System.out.print("  * *   * *");
            }else if (i == 3) {
                System.out.print("   *     *");
            }
            System.out.println();
        }
    }
}
