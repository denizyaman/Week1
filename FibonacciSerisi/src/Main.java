import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1=1;
        int number2=1;
        int eleman;

        Scanner inp = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz: ");//Fibonacci serisinin eleman sayısı
        eleman = inp.nextInt();
        System.out.println(number1);//Fibonacci serisi 1 1 ile başlar
        System.out.println(number2);
        for (int i = 1; i < eleman; i++) {
            int result=number1+number2;
            number1=number2;//Kaydırma işlemi yapılarak toplanacak son iki değer tutulur.
            number2=result;//Kaydırma işlemi yapılarak toplanacak son iki değer tutulur.
            System.out.println(result);
        }
    }
}