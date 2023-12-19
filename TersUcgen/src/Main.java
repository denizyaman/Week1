import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner inp = new Scanner(System.in);

        System.out.println("Basamak sayısı giriniz: ");
        number = inp.nextInt();
        for (int i = number - 1; i >= 0; i--) { //Her döngüde sayı azaltılarak ters üçgen oluştu.
            for (int j = (number - 1 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}