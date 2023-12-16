import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = inp.nextInt();
        if (matematik < 0 || matematik > 100) {//Notun geçerliliği kontrol edilir.
            System.out.println("Notunuz 0 olarak kabul edildi.");
            matematik = 0;

        }
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        if (fizik < 0 || fizik > 100) {//Notun geçerliliği kontrol edilir.
            System.out.println("Notunuz 0 olarak kabul edildi.");
            fizik = 0;
        }
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();
        if (turkce < 0 || turkce > 100) {//Notun geçerliliği kontrol edilir.
            System.out.println("Notunuz 0 olarak kabul edildi.");
            turkce = 0;

        }
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya > 100) {//Notun geçerliliği kontrol edilir.
            System.out.println("Notunuz 0 olarak kabul edildi.");
            kimya = 0;

        }
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();
        if (muzik < 0 || muzik > 100) {//Notun geçerliliği kontrol edilir.
            System.out.println("Notunuz 0 olarak kabul edildi.");
            muzik = 0;

        }
        double avarage = ((matematik + fizik + turkce + kimya + muzik) / 5);
        if (avarage <= 55) {
            System.out.print("Sınıfta kaldınız, seneye tekrar görüşmek üzere! ");
        } else {
            System.out.print("Tebrikler sınıfı geçtiniz! ");

        }
        System.out.print("Ortalamanız: " + avarage);
    }
}