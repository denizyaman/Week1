import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // a,b,c değerleri tanımlanır
        int a,b,c;
        Scanner inp= new Scanner(System.in);
        //Kullanıcıdan değerleri alınır
        System.out.println("a değerini giriniz:");
        a=inp.nextInt();
        System.out.println("b değerini giriniz:");
        b=inp.nextInt();
        System.out.println("c değerini giriniz:");
        c=inp.nextInt();
        //Sonuç ekrana yazdırılır
        System.out.println( "Sonuç="+ (a+b * c-b));
    }
}