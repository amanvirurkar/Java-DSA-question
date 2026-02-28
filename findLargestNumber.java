
import java.util.Scanner;

public class findLargestNumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");  
        int num1 = sc.nextInt();

        System.out.println("enter your second number");
        int num2 = sc.nextInt();
        
        System.out.println("enter your third number");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("the largest number is " + num1);
        } else if(num2>num1 && num2>num3){
            System.out.println("the largest number is " + num2);
        } else {
            System.out.println("the largest number is " + num3);
        }
    }
}
