import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.print("Please enter your Number:");

        int num = input.nextInt();

        int sum = oddSum(num);
        System.out.println("OddSum till "+ num + " is: " + sum);

    }

    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while(i<=num){
            sum = sum+i;

            i=i+2;
        }
        return sum;
    }
}
