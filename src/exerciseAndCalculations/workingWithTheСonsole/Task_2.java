/**
 * @author Vadym Doroshevych
 *
 * @task Вывести на экран текущее название дня недели,
 * название месяца и свое имя. Каждое слово должно быть в отдельной строке.
 */

package exerciseAndCalculations.workingWithTheСonsole;

import exerciseAndCalculations.Task;

import java.util.Calendar;

public class Task_2 implements Task {
    @Override
    public void task(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
