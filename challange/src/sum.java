import java.util.Scanner;

public class sum {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

         System.out.println("Welcome to our Sum calculator");
         System.out.print("Enter tHe First Number:");
         int firstNumber = input.nextInt();
         System.out.print("Enter The Second Number:");
         int secondNumber= input.nextInt();
         int sum =firstNumber+secondNumber;
         System.out.println("Sum of your number is: "  + sum);
     }
}
