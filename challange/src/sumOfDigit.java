import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of Digit:");
        System.out.print("Please! enter the number:");
        int num = input.nextInt();

        int sum = sumOfDigit(num);
        System.out.println(num + " Sum of Digit = " + sum );

    }
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num>0){
           sum = sum + (num%10); // sum %= num;
            num= num/10;
        }

        return sum;
    }
}
