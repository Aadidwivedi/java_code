import java.util.Scanner;

public class rectngle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perimetre of rectangle");
        System.out.println("First Number of rectangle:");
        int first = input.nextInt();

        System.out.println("Second Number of rectangle:");
        int Second = input.nextInt();

        System.out.println("Third Number of rectangle:");
        int third = input.nextInt();

        System.out.println("Fourth Number of rectangle:");
        int fourth = input.nextInt();

        int perimeter_Rectangle = first + Second + third + fourth;

        System.out.println("perimeter_Rectangle:"+perimeter_Rectangle);

    }
}
