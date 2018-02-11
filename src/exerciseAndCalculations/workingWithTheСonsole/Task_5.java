/**
 * @uathor Vadym Doroshevych
 * @task Вывести на экран букву "W" из символов "*" (звездочка).
 */
package exerciseAndCalculations.workingWithTheСonsole;

public class Task_5 {
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
