package Jdbc2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Öğrenci numarasını girin : ");
        int ogr_no = scanner.nextInt();

        System.out.println("Öğrenci adını girin : ");
        scanner.nextLine();
        String ogr_ad = scanner.nextLine();

        System.out.println("Öğrenci soyadını girin : ");
        String ogr_soyad = scanner.nextLine();

        Ogrenci ogrenci = new Ogrenci(ogr_no,ogr_ad,ogr_soyad);
        DbIslemleri.OgrenciEkle(ogrenci);


    }
}
