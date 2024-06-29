
    import java.util.Scanner;

    public class rightHandPrimed{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);;
            System.out.println("We are print thr RighthalfPraymed:");
            System.out.println("please enter the no of rows:");
            int row = input.nextInt();
            RighthalfPraymed(row);
            rightriverse(row);

        }
        public static void rightriverse(int maxrow){
            System.out.println("\n Here is reverse  right half pramid:");
            int row = maxrow;
            while(row>0){
               int i =0;
               while(i<row){
                   System.out.print(" *");
                i++;
               }
                System.out.println();
                row--;
            }
        }
        public static void RighthalfPraymed(int maxrow){
            System.out.println("\n Here is right half pramid:");
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
