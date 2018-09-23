package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BloodpressureModel {
    @SerializedName("bp1")
    @Expose
    private String bp1;
    @SerializedName("bp2")
    @Expose
    private String bp2;
    @SerializedName("date")
    @Expose
    private String date;

    public String getBp1() {
        return bp1;
    }

    public void setBp1(String bp1) {
        this.bp1 = bp1;
    }

    public String getBp2() {
        return bp2;
    }

    public void setBp2(String bp2) {
        this.bp2 = bp2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
