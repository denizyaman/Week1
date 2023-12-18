import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,i;
        double result=0;

        Scanner inp= new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        number= inp.nextInt();

        for (i=1; i<=number ; i++){
            double b=(1.0/i);
            result+=b;
        }
        System.out.println(result);
    }
}