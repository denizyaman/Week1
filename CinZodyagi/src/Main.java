import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year,result;

        Scanner inp= new Scanner(System.in);
        System.out.print("Doğduğunuz yılı giriniz: ");
        year=inp.nextInt();
        result=year%12;//Burç hesabı yapılır.
        switch (result){
            case 0:
                System.out.print(year+" Çin zodyağı burcunuz: Maymun");
                break;
            case 1:
                System.out.print(year+" Çin zodyağı burcunuz: Horoz");
                break;
            case 2:
                System.out.print(year+" Çin zodyağı burcunuz: Köpek");
                break;
            case 3:
                System.out.print(year+" Çin zodyağı burcunuz: Domuz");
                break;
            case 4:
                System.out.print(year+" Çin zodyağı burcunuz: Fare");
                break;
            case 5:
                System.out.print(year+" Çin zodyağı burcunuz: Öküz");
                break;
            case 6:
                System.out.print(year+" Çin zodyağı burcunuz: Kaplan");
                break;
            case 7:
                System.out.print(year+" Çin zodyağı burcunuz: Tavşan");
                break;
            case 8:
                System.out.print(year+" Çin zodyağı burcunuz: Ejderha");
                break;
            case 9:
                System.out.print(year+" Çin zodyağı burcunuz: Yılan");
                break;
            case 10:
                System.out.print(year+" Çin zodyağı burcunuz: At");
                break;
            case 11:
                System.out.print(year+" Çin zodyağı burcunuz: Koyun");
                break;
        }
    }
}