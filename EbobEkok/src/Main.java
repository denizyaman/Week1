import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1,number2;

        Scanner input= new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        number1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2=input.nextInt();
        int i=1;
        int ebob=1;

       while (i<number1) {
           i++;
           if(number1%i==0 && number2%i==0){
               ebob=i;
           }
       }
        System.out.println ("EBOB:" +ebob);
       int ekok=1;
      int a =number2*number1;
       while (i<=a){
           i++;
           if(i%number1==0 && i%number2==0) {
               ekok=i;
               break;
           }
       }
       System.out.print("EKOK: "+ ekok);
    }
}