import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Print the Reverse Number ");
        System.out.print("Please! Enter the Number:");
        int num = input.nextInt();

        int rev=  reverse(num);
        System.out.println(num + " of reverse = " + rev);
    }
    public static int reverse(int num){
       int newNum = 0;
       while(num>0){
           int digit = num%10;
           newNum =newNum * 10 + digit;
           num /= 10;
       }
        return newNum;
    }
}
