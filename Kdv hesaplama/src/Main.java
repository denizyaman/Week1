import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int KDV1=18, KDV2=8;
        double tutar;

        Scanner inp= new Scanner(System.in);
        System.out.print("Kdv'siz fiyat giriniz?");
        tutar= inp.nextDouble();
        System.out.println(tutar);
        if(tutar<=0){
            System.out.println("Sıfırdan büyük değer giriniz");
        } else if(tutar<=1000){
            double kdvtutari=(tutar*KDV1)/100;
            System.out.println("Kdv Tutarı="+kdvtutari);
            System.out.println("Kdv'li Fiyat="+ (tutar+kdvtutari));
        }else if(tutar>1000){
            double kdvtutari1=(tutar*KDV2)/100;
            System.out.println("Kdv Tutarı="+kdvtutari1);
            System.out.println("Kdv'li Fiyat="+(tutar+kdvtutari1));
        }
    }
}