package ClassExercise;

public class Student {
    private int ogr_no;
    private String ogr_name;
    private String ogr_surname;
    private int ogr_grade;

    public Student(int ogr_no, String ogr_name, String ogr_surname, int ogr_grade) {
        this.ogr_no = ogr_no;
        this.ogr_name = ogr_name;
        this.ogr_surname = ogr_surname;
        this.ogr_grade = ogr_grade;
    }

    public int getOgr_no() {
        return ogr_no;
    }

    public void setOgr_no(int ogr_no) {
        this.ogr_no = ogr_no;
    }

    public String getOgr_name() {
        return ogr_name;
    }

    public void setOgr_name(String ogr_name) {
        this.ogr_name = ogr_name;
    }

    public String getOgr_surname() {
        return ogr_surname;
    }

    public void setOgr_soyad(String ogr_soyad) {
        this.ogr_surname = ogr_soyad;
    }

    public int getOgr_grade() {
        return ogr_grade;
    }

    public void setOgr_grade(int ogr_grade) {
        this.ogr_grade = ogr_grade;
    }
}
