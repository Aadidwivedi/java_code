import java.util.Scanner;

public class compundInterest {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Now we calculate in Compound interest");
        System.out.print("Now ' Enter the Principle Value:");
        double P = input.nextDouble();

        System.out.print("Now ' Enter the Rate Value:");
        double R = input.nextDouble();

        System.out.print("Now ' Enter the Time Value:");
        double T= input.nextDouble();

        double coumpandInterest = P*Math.pow((1+R/100),T);
        System.out.println("Your compound interest is "+ coumpandInterest);
    }
}
