import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,result=0;

        Scanner inp=new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz: ");
            i = inp.nextInt();
            if(i%4==0){
                result+=i;
            }
        }while(i%2==0);
        System.out.println("Çift ve 4'ün katları olan sayıları toplamı: "+ result);
    }
}