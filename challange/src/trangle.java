import java.util.Scanner;

public class trangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate Area of trangle:");
        System.out.println("Enter the two side of trangle:");
       double B = input.nextDouble();
       double H = input.nextDouble();


          double Area = 0.5*B*H;

        System.out.println("Area of trangle:"+Area);

    }
}
