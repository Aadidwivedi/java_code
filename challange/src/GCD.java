import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate the GCD Of two numbers");
        System.out.print("Please Enter the First Num1:");
        int num1 = input.nextInt();

        System.out.print("Please Enter the First Num2:");
        int num2 = input.nextInt();

        int gcd = GCD(num1,num2);
        System.out.println(num1 + " and " +  num2 +" GCD is = "+ gcd);
    }
    public  static int GCD(int num1, int num2){
        int GCD  =1 ;
        int i = 2;
        int least = least(num1,num2);
        while(i<=least){
            if(num1%i==0 && num2%i == 0){
                GCD = i;
            }
            i++;
        }
        return GCD;
    }
    public static int least(int num1,int num2){
        if(num1>num2){
            return num1;
        } else{
            return num2;
        }
    }
}
