import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,armutTl=2.14,elmaTl=3.67,domatesTl=1.11,muzTl=0.95,patlicanTl=5.00,total;
        Scanner inp=new Scanner(System.in);
        System.out.print( "Armutun kilosu " + armutTl+" Armut kaç kilo? ");
        armutKg= inp.nextDouble();
        System.out.print(" Elmanın kilosu "+ elmaTl +" Elma kaç kilo?");
        elmaKg= inp.nextDouble();
        System.out.print(" Domatesin kilosu " + domatesTl +" Domates kaç kilo?");
        domatesKg= inp.nextDouble();
        System.out.print(" Muzun kilosu "+ muzTl + " Muz kaç kilo?");
        muzKg= inp.nextDouble();
        System.out.print(" Patlıcanın kilosu "+ patlicanTl + " Patlıcan kaç kilo?");
        patlicanKg= inp.nextDouble();
        if ((armutKg>=0 && elmaKg>=0 && domatesKg>=0 && muzKg>=0 && patlicanKg>=0)) {
            total = (armutTl * armutKg) + (elmaTl * elmaKg) + (domatesTl * domatesKg) + (muzTl * muzKg) + (patlicanTl * patlicanKg);
            System.out.println(total);
        }else{
            System.out.println("Pozitif değer giriniz.");
        }
    }
}