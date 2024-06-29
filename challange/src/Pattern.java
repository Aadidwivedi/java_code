import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        System.out.println("We are print thr pattern:");
        System.out.println("please enter the no of rows:");
        int row = input.nextInt();
         pattern(row);

    }
    public static void pattern(int maxrow){
         int row = 0;
        while(row<maxrow) {
            System.out.print("* ");
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
