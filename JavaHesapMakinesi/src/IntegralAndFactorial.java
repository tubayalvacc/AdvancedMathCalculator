import java.util.Scanner;
public class IntegralAndFactorial {
    static void integral() {
        System.out.println("No Content Found!");
    }

    static void factorial() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! You Choose Factorial Calc. Operation.");
        //--------------n FACTORİAL VALUE---------------
        System.out.print("Enter N number:  ");
        n = input.nextInt();
        int a = 1;
        long nn = 1;
        while (a <= n) {
            nn = a * nn;
            a++;
        }
        System.out.println("The Result of " + n + "! is " + nn);
    }
}


