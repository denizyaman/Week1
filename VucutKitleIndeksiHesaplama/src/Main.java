import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo,sonuc;
        Scanner inp= new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(m) giriniz:");
        boy= inp.nextDouble();
        System.out.print("Lütfen kilonuzu(kg) giriniz:");
        kilo= inp.nextDouble();
        sonuc=(kilo/(boy*boy));
        System.out.print("Vücut kitle indeksiniz: "+sonuc);
    }
}