import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // C(n,r) = n! / (r! * (n-r)!) Kombinasyon formülü
        int n, r;

        Scanner inp = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        r = inp.nextInt();
        int faktoriyel1 = 1;
        int faktoriyel2 = 1;
        int faktoriyel3 = 1;

        if (n >= r) {
            for (int a = 1; a <= n; a++) {
                faktoriyel1 *= a;//n! hesaplaması yapıldı.
            }

            for (int b = 1; b <= r; b++) {
                faktoriyel2 *= b;//r! hesaplaması yapıldı.
            }

            for (int c = 1; c <= (n-r); c++) {
                faktoriyel3 *= c;//(n-r)! hesaplaması yapıldı.
            }

            int result= faktoriyel1 / (faktoriyel2 * faktoriyel3);//Kombinasyon işlemi
            System.out.println("Kombinasyon Sonucu: " + result);
        }else{
            System.out.print("Hatalı veri girdiniz.");
        }
    }
}