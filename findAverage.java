import java.util.Scanner;

public class findAverage {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

      System.out.println("enter your number ");
      int num1 = sc.nextInt();

      System.out.println("enter your number ");
      int num2 = sc.nextInt();

      System.out.println("enter your number ");
      int num3 = sc.nextInt();

      System.out.println("enter your number ");
      int num4 = sc.nextInt();

      int average = (num1 + num2 + num3 + num4 )/ 4;
      System.out.println("average is " + average) ;


     
    }
}
