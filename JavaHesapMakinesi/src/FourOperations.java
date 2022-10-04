import java.util.Scanner;
public class FourOperations {

    //----------------Entrance For Integer Variable-----------------
    public static int[] IntGetVeriable() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number:  ");
        int n1 = input.nextInt();
        System.out.print("Enter 2nd Number:  ");
        int n2 = input.nextInt();
        return new int[]{n1, n2};
    }

    //---------------Entrance For Double Variable-----------------
    public static double[] DoubleGetVeriable() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Dividend:  ");
        double n1 = input.nextDouble();
        System.out.print("Enter Quotient:  ");
        double n2 = input.nextDouble();
        return new double[]{n1, n2};
    }

    //--------------Four Operations-----------------
    public static int Addition() {
        int[] callback = IntGetVeriable();
        return callback[0] + callback[1];
    }

    public static int Subtraction() {
        int[] callback = IntGetVeriable();
        return callback[0] - callback[1];
    }

    public static int Multiplication() {
        int[] callback = IntGetVeriable();
        return callback[0] * callback[1];
    }

    static double Division() throws Exception {
        double[] callback = DoubleGetVeriable();

        if (callback[0] >= callback[1]) {
            return (callback[0] / callback[1]);
        } else {
            throw new Exception("Error! Division by zero can not calculated!");
        }
    }

    //--------------Squaring Operation--------------
    public static int Squaring() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number:  ");
        int n1 = input.nextInt();

        return n1 * n1;
    }
}

    /*public static void main(String[] args) {
        int select;

        System.out.println("Welcome to Calculator! Please Enter The Number for Calculation!");
        secimwhile:
        while (true) {
            Scanner input1 = new Scanner(System.in);

            System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Squaring\n6-Cubing\n7-Exit");
            System.out.print("Your Choice:  ");
            select = input1.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Addition Result:  " + Addition());
                    break;
                case 2:
                    System.out.println("Subtraction Result:  " + Subtraction());
                    break;
                case 3:
                    System.out.println("Multiplication Result:  " + Multiplication());
                    break;
                case 4:
                    try {
                        System.out.println("Division Result:  " + Division());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Squaring Result:  " + Squaring());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case 7:
                    System.out.println("Exit");
                    break secimwhile;

            }
        }
    }
}*/
