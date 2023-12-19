import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, value = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");//Kullanıcıdan sayı girişi istenir.
        number = input.nextInt();


        for (int i = 1; i < number; i++) {
            // Kullanıcıdan aldığımız sayıya kadar tam sayı bölenlerine bakarız
            if (number % i == 0) {
                //Tam sayı çarpanlarını toplarız.
                value += i;
            }
        }
        if (number==value) {//Bölenlerin toplamı sayıya eşit mi diye kontrol edilir.
            System.out.println(number+": Mükemmel sayıdır ");
        }else{
          System.out.println( number+": Mükemmel sayı değildir");
        }
    }
}