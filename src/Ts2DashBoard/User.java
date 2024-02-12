package Ts2DashBoard;

public class User {
    private String user_name;
    private int dor_count;
    private int sky_box;

    public User(String user_name, int dor_count, int sky_box) {
        this.user_name = user_name;
        this.dor_count = dor_count;
        this.sky_box = sky_box;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getDor_count() {
        return dor_count;
    }

    public void setDor_count(int dor_count) {
        this.dor_count = dor_count;
    }

    public int getSky_box() {
        return sky_box;
    }

    public void setSky_box(int sky_box) {
        this.sky_box = sky_box;
    }
}
