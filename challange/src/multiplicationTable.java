import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World\n");
        System.out.println("Please enter the your number:");
        int num = input.nextInt();
        multiTable(num);
    }

    public static void multiTable(int num){
       int i=1;
        while (i<=10){
            System.out.println(num+"X"+i+"="+(num*i));
            i++;
        }
    }
}
