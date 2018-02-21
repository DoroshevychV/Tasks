/**
 * @author Vadym Doroshevych
 *
 * @task Известно, что 'x' кг конфет стоит 'a' гривен.
 * Определите, сколько стоит 'y' кг этих конфет,
 * а также сколько кг конфет можно купить на 'k' гривен.
 * Все значения вводит пользователь.
 */
package exerciseAndCalculations.simplestArithmetic;

import java.util.Scanner;

public class Task_23 {
    public void task(){
        double x,a,y,k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write mass in kg: ");
        x = scanner.nextDouble();
        System.out.println("Write the price for the previous introduced mass: ");
        a = scanner.nextDouble();
        System.out.println("Write how much you want to buy (kg): ");
        y = scanner.nextDouble();
        System.out.println("Write the amount of rubles to calculate what mass you can buy for them: ");
        k = scanner.nextDouble();

        double oneKG_UAH;
        if(x > 0 && a > 0 && y > 0){
            if(x < 1){
                oneKG_UAH = a * (1/x);
                System.out.println("Price for one kg  = " + (double)oneKG_UAH+" UAH");
                System.out.println("Price for "+y+" kg  = " + (double)oneKG_UAH*y+" UAH");
                System.out.println("For "+k+" UAH you can buy "+(double)+k/oneKG_UAH+" kg");
            }else if(x == 1){
                oneKG_UAH = a;
                System.out.println("Price for one kg  = " + (double)oneKG_UAH+" UAH");
                System.out.println("Price for "+y+" kg  = " + (double)oneKG_UAH*y+" UAH");
                System.out.println("For "+k+" UAH you can buy "+(double)+k/oneKG_UAH+" kg");
            }else {
                oneKG_UAH = a / x;
                System.out.println("Price for one kg  = " + (double)oneKG_UAH+" UAH");
                System.out.println("Price for "+y+" kg  = " + (double)oneKG_UAH*y+" UAH");
                System.out.println("For "+k+" UAH you can buy "+(double)+k/oneKG_UAH+" kg");
            }
        }else{
            System.out.println(new IllegalArgumentException("Error!"));
            System.exit(0);
        }




    }
}
