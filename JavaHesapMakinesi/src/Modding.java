import java.util.Scanner;

public class Modding {
    public static void mod (){
        Scanner input= new Scanner ( System. in ) ;
        System.out.println("İ Value:  ");
        int i = input.nextInt();
        int n=i;
        if(i<0)
            i=i*-1;
        System.out.println("Mod(" +n+")="+i);
    }
}
