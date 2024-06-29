import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM Calculate");
        System.out.print("Please! Enter the first Num1:");
        int num1 = input.nextInt();

        System.out.print("Please! Enter the first Num2:");
        int num2 = input.nextInt();

        int lcm = LCM(num1,num2);

        System.out.println("LCM OF Two No : " + num1 + " and " + num2 +" is " + lcm);
    }
    public static int LCM(int num1,int num2){
//        if(num1%num2==0){
//            return num1;
//        } else if (num2%num1==0) {
//            return  num2;
//        }
        int i =1;
        while(i<=num2){
            int factor= num1*i;
            if(factor%num2==0){
               return  factor ;
            }
            i++;

        }
        return 0;
    }
}
