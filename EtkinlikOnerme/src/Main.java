import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
//kullanıcıdan hava sıcaklığı değeri alınır.
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        heat = inp.nextInt();
        if (heat <= 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        if (heat >= 5 && heat <= 15) {
            System.out.print("Sinemaya gidebilirsiniz. ");
        }
        if (heat > 15 && heat <= 25) {
            System.out.print("Pikniğe gidebilirsiniz. ");
        }
        if (heat > 25) {
            System.out.print("Yüzmeye gidebilirsiniz. ");
        }
    }
}