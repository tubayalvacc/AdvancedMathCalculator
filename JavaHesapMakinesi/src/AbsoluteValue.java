import java.util.Scanner;

public class AbsoluteValue {
   static void Run(){
       Scanner input = new Scanner(System.in);
       System.out.println(
               "1:Integer Value"
               + "2.Float Value"
       );
       int select = input.nextInt();

       switch (select){
           case 1:
               absValueInt();
           case 2:
               absValueFloat();
       }
   }
    public static void absValueInt() {
        Scanner input = new Scanner(System.in);

        /* Converting Integer values */
        System.out.println("Enter X Value:  ");
        int x = input.nextInt();
        System.out.println("Enter Y Value:  ");
        int y = input.nextInt();

        System.out.printf( "Absolute Value of x: %d \n", Math.abs(x) );
        System.out.printf( "Absolute Value of y: %d \n", Math.abs(y) );
    }
    static void absValueFloat(){
        Scanner input = new Scanner(System.in);
        /* Converting Floating Point values */
        System.out.println("Enter X Value:  ");
        float a = input.nextFloat();
        System.out.println("Enter Y Value:  ");
        float b = input.nextFloat();

        System.out.printf( "Absolute Value of a: %f \n", Math.abs(a) );
        System.out.printf( "Absolute Value of b: %f \n", Math.abs(b) );
    }

}
