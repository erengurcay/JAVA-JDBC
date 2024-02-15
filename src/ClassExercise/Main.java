package ClassExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Okul numaranızı giriniz:");
        int ogr_no = scanner.nextInt();

        System.out.println("Adınızı giriniz: ");
        scanner.nextLine();
        String ogr_name = scanner.nextLine();


        System.out.println("Soyadınızı giriniz: ");
        String ogr_surname = scanner.nextLine();

        System.out.println("Sınıfınızı giriniz : ");
        int ogr_grade = scanner.nextInt();

        Student student = new Student(ogr_no,ogr_name,ogr_surname,ogr_grade);
        DbIslemleri.createStudent(student);













    }
}

