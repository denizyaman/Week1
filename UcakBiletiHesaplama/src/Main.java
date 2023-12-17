import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance,pricePerKm=0.10,basePrice,result,discountedPrice,sale50=0.50,sale10=0.10,sale30=0.30,sale20=0.20;
        int age, travelType;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz: ");
        age= inp.nextInt();
        System.out.print("Masafeyi Km türünden giriniz: ");
        distance=inp.nextDouble();
        System.out.println("1: Tek Yön\n"+"2: Gidiş- Dönüş\n");
        System.out.print("Yolculuk tipni giriz: ");
        travelType= inp.nextInt();

        if (age>=1 && distance>=1&& (travelType==1|| travelType==2)){
            basePrice=distance*pricePerKm;// Normal tutar hesaplaması yapılır.
            result=basePrice;

            if(age<=12){
                discountedPrice=result*sale50;
                result=result-discountedPrice;// Yaş indirimi uygulanmış fiyat hesaplanır.
                System.out.println("Yaş indirimi uygulandı. ");
            } else if (age>12&& age<=24) {
                discountedPrice=result*sale10;
                result=result-discountedPrice;// Yaş indirimi uygulanmış fiyat hesaplanır.
                System.out.println("Yaş indirimi uygulandı. ");
            }else if (age>65){
                discountedPrice=result*sale30;
                result=result-discountedPrice;// Yaş indirimi uygulanmış fiyat hesaplanır.
                System.out.println("Yaş indirimi uygulandı. ");
            }
            if (travelType==2){
                discountedPrice=result*sale20;
                result=(result-discountedPrice);
                result=result*2;
                System.out.println("Gidiş-Dönüş alınan bilet indirimi uygulandı. ");
            }

            System.out.println("Toplam fiyat: "+ result);

        }else{
            System.out.print("Hatalı veri girdiniz!");
        }

    }
}