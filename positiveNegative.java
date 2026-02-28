import java.util.Scanner;
public class positiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println(num1 + " is a positive number.");
        } else if (num1 < 0) {
            System.out.println(num1 + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}