
import java.util.Scanner;

public class minutesToHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your min");
        int min = sc.nextInt();

        int hours = min/60;
        System.out.println ( hours + " hours " );
    }
}
