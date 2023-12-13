import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double  km, perkm=2.20, total=10;
        Scanner inp=new Scanner(System.in);
        System.out.println("Taksimetre başlangıç ücreti 10 TLdir."+" Taksimetre Km başına 2.20 TL tutmaktadır.");
        System.out.print("km değerini giriniz:");
        km= inp.nextDouble();
        if (km >= 1 ) {
            total += (km * perkm);
            total = (total <= 20) ? 20 : total;
            System.out.print(total);
        }else {
            System.out.print("Pozitif değer giriniz.");
        }

    }
}