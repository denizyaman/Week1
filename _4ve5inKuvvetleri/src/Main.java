import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, k;

        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        i= inp.nextInt();
        System.out.println("4'ün kuvvetleri: ");
        for(k=1;k<=i;k*=4){
            System.out.println(k);
        }
        System.out.println("5'in kuvvetleri: ");
        for(k=1;k<=i;k*=5){
            System.out.println(k);
        }
    }
}