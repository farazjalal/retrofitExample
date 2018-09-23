package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TemperatureModel {
    @SerializedName("temparature")
    @Expose
    private String temparature;
    @SerializedName("date")
    @Expose
    private String date;

    public String getTemparature() {
        return temparature;
    }

    public void setTemparature(String temparature) {
        this.temparature = temparature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
