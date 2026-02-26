import java.util.Scanner;

public class evenOrOdd{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0){
            System.out.println(num1 + " is an even number.");
        }
        else{
            System.out.println(num1 + " is an odd number.");
        }
        sc.close();
    }
}