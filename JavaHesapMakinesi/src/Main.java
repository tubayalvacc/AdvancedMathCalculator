import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("User name:\t");
        String username = input.nextLine();

        System.out.println("Welcome Dear " + username + "!"
                +"\tPlease Choose Operations;"
                +"\n1-Four Operations"
                +"\n2-Exponentiation Number"
                +"\n3-Square Root"
                +"\n4-Derivative Calculating."
                +"\n5-Integral Calculating."
                +"\n6-Factorial Calculating."
                +"\n7-Find Absolute Value"
                +"\n8-Modding");
        System.out.print("Your Choice:  ");
        int option = input.nextInt();


        //----------------F O U R   O P E R A T I O N S-------------------
        switch (option) {
            case 1:
                System.out.print("Please Choose Operation;\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\nCHOİCE\t:\t");
                int option2 = input.nextInt();
                if (option2 == 1) {
                    //FourOperations.Addition();
                    System.out.println("Addition Result: " + FourOperations.Addition());
                    break;
                } else if (option2 == 2) {
                    //FourOperations.Subtraction();
                    System.out.println("Subtraction Result:  " + FourOperations.Subtraction());
                    break;
                } else if (option2 == 3) {
                    //FourOperations.Multiplication();
                    System.out.println("Multiplication Result:  " + FourOperations.Multiplication());
                    break;
                } else if (option2 == 4) {
                    //FourOperations.Division();
                    System.out.println("Division Result:  " + FourOperations.Division());
                    break;
                }
            case 2:
                Exponentiation.exponentiation();
                break;
            case 3:
                SquareRoot.square();
                break;
            case 4:
                Derivative.Run();
                break;
            case 5:
                IntegralAndFactorial.integral();
                break;
            case 6:
                IntegralAndFactorial.factorial();
                break;
            case 7:
                AbsoluteValue.Run();
                break;
            case 8:
                Modding.mod();
                break;

        }
    }
}
