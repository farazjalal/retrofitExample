package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeightModel {
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("date")
    @Expose
    private String date;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}