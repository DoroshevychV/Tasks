/**
 * @author Vadym Doroshevych
 *
 * @task Вывести на экран прямоугольник, заполненный буквами А.
 * Количество строк в прямоугольнике равно 5, количество столбцов равно 8.
 */
package exerciseAndCalculations.workingWithTheСonsole;

import exerciseAndCalculations.Task;

public class Task_4 implements Task{
    @Override
    public void task(){
        for(int i = 0;i<5;i++){
            for (int j = 0;j<8;j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
