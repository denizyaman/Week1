import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double yaricap, piDegeri=3.14, alan, aci;
        Scanner inp= new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz:");
        yaricap= inp.nextDouble();
        System.out.print("Daire diliminin açısını giriniz:");
        aci= inp.nextDouble();
        alan=((piDegeri*(yaricap*yaricap)*aci))/360;
        System.out.print("Daire diliminin alanı="+ alan);
    }
}