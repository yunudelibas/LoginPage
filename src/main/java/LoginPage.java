package Donguler;

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        String userName, password,newPassword,decision;
        Scanner input= new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz:");
        userName=input.nextLine();
        System.out.print("Şifrenizi Giriniz:");
        password=input.nextLine();

        if (userName.equals("patika") && password.equals("Java123")) {
            System.out.println("Giriş Başarılı");

        }else if (!userName.equals("patika") && !password.equals("Java123")){
            System.out.println("Kullanıcı adınızı ve Şifrenizi yanlış girdiniz.");

        }else if (!userName.equals("patika") && password.equals("Java123")){
            System.out.println("Kullanıcı adınızı yanlış girdiniz.");
        }
        else if (userName.equals("patika") && !password.equals("Java123")){
            System.out.println("şifrenizi yanlış girdiniz. Şifrenizi yenilemek ister misiniz?\nevet\nhayır");
            decision=input.nextLine();
            if (decision.equals("evet")) {
                System.out.print("Yeni Şifrenizi giriniz:");
                newPassword = input.nextLine();

                if (newPassword.equals("Java123") || newPassword.equals(password)) {
                    System.out.println("şifre değiştirilemedi");
                } else {
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                    password = newPassword;
                    System.out.println("yeni şifreniz:" + password);
                }

            }else if (decision.equals("hayır")) {
                System.out.println("mevcut şifreniz ile tekrar giriş yapmayı deneyiniz.");

            }

        }
    }

}
