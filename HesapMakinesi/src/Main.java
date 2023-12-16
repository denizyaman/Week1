import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2;

//Kullanıcıdan değerler alınır.
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        number1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2 = inp.nextInt();
        System.out.print("1=Toplama\n,2=Çıkarma\n,3=Çarpma\n,4=Bölme");
        System.out.print(" İşlem türünü seçiniz: ");
        int select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam sonuç= " + (number1 + number2));
                break;
            case 2:
                System.out.print("Çıkarma sonuç= " + (number1 - number2));
                break;
            case 3:
                System.out.print("Çarpma sonuç= " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {// Paydanın sıfırdan farklı olduğu kontrol edilir.
                    System.out.print("Bölme sonuç= " + (number1 / number2));
                    break;
                } else {
                    System.out.print("Bir sayı 0'a bölünemez.");
                }
        }
    }
}