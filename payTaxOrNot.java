import java.util.Scanner;

public class payTaxOrNot {
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
        int salary = sc.nextInt();

        if (salary > 50000) {
            System.out.println("You have to pay tax.");
        } else {
            System.out.println("You don't have to pay tax.");
        }
    }
}
