import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double u,alan;
        Scanner inp= new Scanner(System.in);
        System.out.print("1.kenar değerini giriniz:");
        a=inp.nextInt();
        System.out.print("2. kenar değerini giriniz:");
        b=inp.nextInt();
        System.out.print("3. kenar değerini giriniz:");
        c=inp.nextInt();
        if (Math.abs(b-c) < a && a < (b+c)&&Math.abs(a-c) < b && b < (a+c)&&Math.abs(a-b) < c && c < (a+b)){
            u=(a+b+c)/2;
            alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
            System.out.println(alan);
        }else{
            System.out.println("Üçgen oluşturmaz");
        }
    }
}