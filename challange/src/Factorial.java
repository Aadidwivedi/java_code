import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate The factorial of given Numbers");
        System.out.print("Please Enter the Number:");
        int num = input.nextInt();

        long  fact = factorial(num);

        System.out.println(num+"! is = "+fact);
    }
    public static long factorial(int num){
        if(num<2){
            return 1;
        }
        int fact = 1;
        int i=2;
        while(i<=num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
