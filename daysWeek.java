
import java.util.Scanner;

public class daysWeek {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("The number of days are:");

        int num1 = sc.nextInt();

        int week = num1 / 7;

        System.out.println("the weeks are " + week);

    }
}
