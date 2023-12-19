import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int intNumber;
        double doubleNumber;

        Scanner input=new Scanner(System.in);
        System.out.print("Tam sayı değeri giriniz: ");
        intNumber= input.nextInt();
        System.out.print("Ondalıklı sayı değeri giriniz: ");
        doubleNumber=input.nextDouble();
        //Tip döüşümlerinde dönüştüreceğimiz sayının önüne parantez içerisinde dönüştürmek istediğimiz tipi yazarsak dönüşüm gerçekleşir.
        System.out.println((double)intNumber);
        System.out.println((int)doubleNumber);

    }
}