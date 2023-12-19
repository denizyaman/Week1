import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, value, max = 0, min = 0;

        Scanner inp = new Scanner(System.in);
        //Kullanıcının kaç adet sayı gireceğini öğreniriz.
        System.out.print("Kaç adet sayı gireceksiniz? :");
        value = inp.nextInt();
        for (int i = 1; i <= value; i++) {//for döngüsüyle kullanıcının gireceği sayı kadar kullanıcıdan sayı alırız.
            System.out.println(i + ". Sayı: ");
            number = inp.nextInt();
            if (i == 1) {//Bir adet sayı girilirse hem min. hemde max. değer girilen sayı olur.
                max = number;
                min = number;
            } else {
                if (number > max) {//Birden fazla sayı girildiğinde sayının max. değerden büyük mü olduğu kontrol edilir.
                    max = number;//Girilen sayı büyükse yeniden max. değerine atanır.
                } else if (number < min) {
                    min = number;//min. değer içinde sayının min değerden küçüklüğüne bakılır.
                }
            }
        }
        System.out.println("Max. Değer: " + max);
        System.out.println("Min. Değer: " + min);
    }
}