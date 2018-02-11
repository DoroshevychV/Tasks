/**
 * @author Vadym Doroshevych
 *
 * @task Вывести на экран текущее название дня недели,
 * название месяца и свое имя. Каждое слово должно быть в отдельной строке.
 */

package exerciseAndCalculations.workingWithTheСonsole;

import java.util.Calendar;
import java.util.Date;

public class Task_2 {
    public void task(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
