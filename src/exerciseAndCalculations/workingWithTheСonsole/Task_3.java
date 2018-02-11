/**
 * @author Vadym Doroshevych
 *
 * @task Вывести на экран пять строк из нулей,
 * причем количество нулей в каждой строке равно номеру строки.
 */
package exerciseAndCalculations.workingWithTheСonsole;

public class Task_3 {
    public void task(){
        for(int i = 0;i <5;i++){
            for (int j = 0;j<i+1;j++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
