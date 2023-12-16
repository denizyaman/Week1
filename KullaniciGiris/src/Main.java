import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, result, newPassword;

//Kullanıcıdan kullanıcı adı ve şifre istenir.
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz:");
        userName = inp.nextLine();
        System.out.println("Şifrenizi giriniz:");
        password = inp.nextLine();

        if (userName.equals("patika")) {
            //Kullanıcı adı doğruluğu kontrol edilir doğruysa şifre kontrol edilir.
            if (password.equals("java123")) {
                //Kullanıcı adı ve şifre doğruysa giriş başarılı olur.
                System.out.print("Giriş başarılı");
            } else {
                //Şifrenin hatalı olduğu durumda şifre yenileme isteği sorulur.
                System.out.println("Şifre hatalı, şifrenizi değiştirmek ister misiniz? yes/no");
                result = inp.nextLine();
                if (result.equals("yes")) {
                    //Kullanıcıdan yeni şifre istenir.
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newPassword = inp.nextLine();
                    if (newPassword.equals("java123")) {
                        //Yeni şifre eski şifreyle aynıysa şifre oluşturulamaz
                        System.out.print("Şifre oluşturulamadı.Lütfen başka şifre giriniz.");
                    } else {
                        //Yeni şifre eski şifreden farklıysa yeni şifre oluşturulur.
                        System.out.print("Yeni şifre oluşturuldu.");
                    }
                }
            }
        } else {
            //Kullanıcı adının hatalı olduğu durumda şifrede hatalı mı diye kontrol edilir.
            if (!password.equals("java123")) {
                System.out.print("Kullanıcı adı ve şifre hatalı lütfen kontrol ediniz.");
            } else {
                //Şifre doğruysa kullanıcı adı hatalı yazdırılır.
                System.out.print("Kullanıcı adı hatalı lütfen kontrol ediniz.");
            }
        }
    }
}