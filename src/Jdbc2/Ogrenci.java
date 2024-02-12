package Jdbc2;

public class Ogrenci {
    private int ogr_no;
    private String ogr_ad;
    private String ogr_soyad;

    public Ogrenci(int ogr_no, String ogr_ad, String ogr_soyad) {
        this.ogr_no = ogr_no;
        this.ogr_ad = ogr_ad;
        this.ogr_soyad = ogr_soyad;
    }

    public int getOgr_no() {
        return ogr_no;
    }

    public void setOgr_no(int ogr_no) {
        this.ogr_no = ogr_no;
    }

    public String getOgr_ad() {
        return ogr_ad;
    }

    public void setOgr_ad(String ogr_ad) {
        this.ogr_ad = ogr_ad;
    }

    public String getOgr_soyad() {
        return ogr_soyad;
    }

    public void setOgr_soyad(String ogr_soyad) {
        this.ogr_soyad = ogr_soyad;
    }
}
