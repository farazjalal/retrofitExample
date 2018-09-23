package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BmiModel {
    @SerializedName("bmi")
    @Expose
    private String bmi;
    @SerializedName("date")
    @Expose
    private String date;

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
