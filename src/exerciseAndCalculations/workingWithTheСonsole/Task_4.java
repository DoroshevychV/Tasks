/**
 * @author Vadym Doroshevych
 *
 * @task Вывести на экран прямоугольник, заполненный буквами А.
 * Количество строк в прямоугольнике равно 5, количество столбцов равно 8.
 */
package exerciseAndCalculations.workingWithTheСonsole;

public class Task_4 {
    public void task(){
        for(int i = 0;i<5;i++){
            for (int j = 0;j<8;j++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
