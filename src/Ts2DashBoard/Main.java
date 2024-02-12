package Ts2DashBoard;

import Jdbc2.DbIslemleri;
import Jdbc2.Ogrenci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı girin : ");
        String user_name = scanner.nextLine();

        System.out.println("Girdiğiniz DOR sayısını giriniz : ");
        int dor_count = scanner.nextInt();

        System.out.println("Aldığınız gök sandığı droplarınızın sayısını giriniz : ");
        int sky_box = scanner.nextInt();

        User user = new User(user_name,dor_count,sky_box);
        VeritabaniIslemleri.updateUser(user);

    }
}
