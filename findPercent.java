import java.util.Scanner;

public class findPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in subject 1 ");
        int num1 = sc.nextInt();

         System.out.println("enter your marks in subject 2 ");
         int num2 = sc.nextInt();

         System.out.println("enter your marks in subject 3 ");
         int num3 = sc.nextInt();

         System.out.println("enter your marks in subject 4 ");
         int num4 = sc.nextInt();

         System.out.println("enter your marks in subject 5 ");
         int num5 = sc.nextInt();

         int total = num1 + num2 + num3 + num4 + num5;

         double percent = (total / 500)*100;

         System.out.println("your percent is " + percent);




    }
}
