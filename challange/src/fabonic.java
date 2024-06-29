import java.util.Scanner;

public class fabonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print the Fabonic Series Number:");
        System.out.println("Please! Enter the number:");
        int num = input.nextInt();
        Fibonacci(num);
        System.out.println();
    }

    public static void Fibonacci(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if(num==0) return;
        int first = 0, second = 1;
        System.out.print("1 ");
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;

        }
    }
}