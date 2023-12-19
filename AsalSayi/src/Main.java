public class Main {
    public static void main(String[] args) {
        int divisor=0;

        for (int i = 1; i < 100; i++) {//1'den 100'e kadar olan sayılar için çalışır.
            for (int k = 1; k < i; k++) {//Sayının kendisinden küçük olan sayılar için çalışıyor.
                if (i%k == 0) { // Sayının kendisinden küçük sayılara göre modunu alırız.Modu sıfırsa bölen sayısına bakarız.
                    divisor+=1;
                }
            }
            if(divisor==1){
                // Bölen sayısı 1 ve kendisi olan sayılar asal olacaktır.
                // Sayının kendisinden küçük değerlere göre modunu aldığımız için bölen sayısı 1 olacaktır.
                System.out.println("Asal sayı: "+ i);
            }
           divisor=0;//Bir sonraki sayıya geçtiğinde bölen sayısını sıfırlayacaktır.
        }
    }
}