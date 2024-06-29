import java.util.Scanner;

public class palandrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print the Panandrom Number:");
        System.out.println("Please! Enter the number:");
        int num = input.nextInt();

        int pland = paland(num);
        if(num== pland){
            System.out.println(num + " is Plandram: " + pland);
        }else{
            System.out.println(num + " iS NOT Plandram : " + pland +"  Because both are not equal");
        }
    }
    public static int paland(int num){
        int newNum= 0;
        while(num>0){
            int digit = num%10;
            newNum =newNum * 10 + digit;
            num /= 10;
        }

        return newNum;
    }
}