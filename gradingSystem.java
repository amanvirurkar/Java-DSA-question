
import java.util.Scanner;

public class gradingSystem {
    public static void main (String[]args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your marks out of 100");
            int marks = sc.nextInt();
            if(marks>=90 && marks <=100){
                System.out.println("you are in first position " + marks);
            }else if (marks >=70 && marks <= 90 ){
                System.out.println("you are in Second position " + marks);
    }else if (marks >=50 && marks <= 70 ){
                System.out.println("you are in third position " + marks);
    } else{
        System.out.println("you are fail");
    }
}
}
