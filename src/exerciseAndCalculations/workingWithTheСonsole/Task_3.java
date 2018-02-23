/**
 * @author Vadym Doroshevych
 *
 * @task Вывести на экран пять строк из нулей,
 * причем количество нулей в каждой строке равно номеру строки.
 */
package exerciseAndCalculations.workingWithTheСonsole;

import exerciseAndCalculations.Task;

public class Task_3 implements Task {
    @Override
    public void task(){
        for(int i = 0;i <5;i++){
            for (int j = 0;j<i+1;j++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
