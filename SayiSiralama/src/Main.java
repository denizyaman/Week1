import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, number3;

        Scanner inp = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        number1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz : ");
        number3 = inp.nextInt();

        if ((number1 > number2) && (number1 > number3)) {
            if ((number2 > number3)) {
                System.out.print(number1 + ">" + number2 + ">" + number3);
            } else {
                System.out.print(number1 + ">" + number2 + ">" + number3);
            }
        } else if ((number2 > number1) && (number2 > number3)) {
            if (number1 > number3) {
                System.out.print(number2 + ">" + number1 + ">" + number3);
            } else {
                System.out.print(number2 + ">" + number3 + ">" + number1);
            }
        } else if ((number3 > number1) && (number3 > number2)) {
            if (number1 > number2) {
                System.out.print(number3 + ">" + number1 + ">" + number2);
            } else {
                System.out.print(number3 + ">" + number2 + ">" + number1);
            }
        }
    }
}