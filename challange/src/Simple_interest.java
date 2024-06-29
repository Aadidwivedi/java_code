import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate the simple interest:\n");
        System.out.println("We enter the three value of P R T Value:");

        System.out.print("Enter the Value of P:");
        double P = input.nextDouble();

        System.out.print("Enter the Value of R:");
        double R = input.nextDouble();

        System.out.print("Enter the Value of T:");
        double T = input.nextDouble();

        double simpleInterest= (P*R*T)/100;

        System.out.println("simle Interest="+ simpleInterest);
    }
}
