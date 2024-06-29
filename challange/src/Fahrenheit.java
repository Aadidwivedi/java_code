import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate the Fahrenheit /n ");
        System.out.println("Please' Enter the two Value C and F:");
//
        System.out.print("Please Enter the temp in  F value:");
        double F= input.nextDouble();
        double C = (F-32)*5/9;
        System.out.println("Fahrenheit="+C+"C");
    }
}
