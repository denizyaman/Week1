import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,result=0,mod;

        Scanner inp= new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        number= inp.nextInt();
        while (number!=0){
           mod =number%10;//Sayının modu alınırak basamak sayıları bulunur.
           number/=10;
           result+=mod;
        }
        System.out.println("Basamak sayılarının toplamı: " +result);
    }
}