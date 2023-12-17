import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,k,result=0,count=0;

        Scanner inp= new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        i= inp.nextInt();
        for(k=1 ;k<=i; k++){
            if(k%2==0){
                if((k%3==0) && (k%4==0)){
                    count++;//3 ve 4'e tam bölünen sayıların adedi
                    result+=k;//3 ve 4'e tam bölünen sayıların toplamı
                    System.out.println(k);
                }
            }
        }System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + result/count);//3 ve 4'e tam bölünen sayıların ortalaması
    }
}