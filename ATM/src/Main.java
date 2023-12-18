import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int rihgt = 3, select, balance = 1500;
        while (rihgt > 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();
            if ((userName.equals("patika")) && (password.equals("dev123"))) {
                System.out.print("Sisteme giriş yaptınız.\n" + "Patika Bankasına Hoşgeldiniz. ");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:\n " + "1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap\n");
                select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Para miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.print("Güncel bakiyeniz: " + balance);
                        break;
                    case 2:
                        System.out.print("Para miktarı: ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.print("Bakiyeniz yetersiz.");
                        } else {
                            balance -= price;
                            System.out.print("Güncel bakiyeniz: " + balance);
                        }
                        break;
                    case 3:
                        System.out.print("Bakiyeniz: " + balance);
                        break;
                    case 4:
                        System.out.print("Tekrar görüşmek üzere.");
                        break;
                }
                break;
            } else {
                rihgt--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.");
                if (rihgt == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Bankanız ile iletişime geçiniz.");
                    break;
                } else {
                    System.out.println("Kalan kullanım hakkınız: " + rihgt);
                }
            }
        }
    }
}