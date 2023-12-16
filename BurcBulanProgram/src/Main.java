import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz: ");
        month = inp.nextInt();
        //Ayların 1 ve 12 arasında girilmesini kontrol ediyoruz
        if (month < 1 || month > 12) {
            System.out.println("1-12 aralığında bir değer giriniz.");
        }
        System.out.print("Doğduğunuz günü giriniz: ");
        day = inp.nextInt();
        //Günlerin 1 ve 31 arasında olmasını kontrol ediyoruz
        if (day < 1 || day > 31) {
            System.out.println("1-31 aralığında bir değer giriniz.");
        }

        if (month == 1) {
            if (day <= 21) {
                System.out.print("Oğlak Burcu");
            } else {
                System.out.print("Kova Burcu");
            }
        } else if (month == 2) {
            if (day <= 19) {
                System.out.print("Kova Burcu");
            } else if (day <= 29) {//Şubat 29 çektiği için kontrol edilir.
                System.out.print("Balık Burcu");
            } else {
                System.out.print("Geçerli bir tarih giriniz");
            }
        } else if (month == 3) {
            if (day <= 20) {
                System.out.print("Balık Burcu");

            } else {
                System.out.print("Koç Burcu");
            }
        } else if (month == 4) {
            if (day <= 20) {
                System.out.print("Koç Burcu");
            } else if (day <= 30) {//Nisan 30 çektiği için 30'dan küçük değer girilmesi kontrol edilir.
                System.out.print("Boğa Burcu");
            } else {
                System.out.print("Geçerli bir tarih giriniz.");
            }
        } else if (month == 5) {
            if (day <= 21) {
                System.out.print("Boğa Burcu");
            } else {
                System.out.print("İkizler Burcu");
            }
        } else if (month == 6) {
            if (day <= 22) {
                System.out.print("İkizler Burcu");
            } else if (day <= 30) {//Haziran 30 çektiği için 30'dan küçük değer girilmesi kontrol edilir.
                System.out.print("Yengeç Burcu");
            } else {
                System.out.print("Geçerli bir tarih giriniz.");
            }
        } else if (month == 7) {
            if (day <= 22) {
                System.out.print("Yengeç Burcu");
            } else {
                System.out.print("Aslan Burcu");
            }
        } else if (month == 8) {
            if (day <= 22) {
                System.out.print("Aslan Burcu");
            } else {
                System.out.print("Başak Burcu");
            }
        } else if (month == 9) {
            if (day <= 22) {
                System.out.print("Başak Burcu");
            } else if (day <= 30) {//Eylül 30 çektiği için 30'dan küçük değer girilmesi kontrol edilir.
                System.out.print("Terazi Burcu");
            }
        } else if (month == 10) {
            if (day <= 22) {
                System.out.print("Terazi Burcu");
            } else {
                System.out.print("Akrep Burcu");
            }

        } else if (month == 11) {
            if (day <= 21) {
                System.out.print("Akrep Burcu");
            } else if (day <= 30) {//Kasım 30 çektiği için 30'dan küçük değer girilmesi kontrol edilir.
                System.out.print("Yay Burcu");
            } else {
                System.out.print("Geçerli bir tarih giriniz.");
            }
        } else if (month == 12) {
            if (day <= 21) {
                System.out.print("Yay Burcu");
            } else {
                System.out.print("Oğlak Burcu");
            }
        }
    }
}