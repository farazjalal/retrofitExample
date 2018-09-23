package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UrinalysisModel {
    @SerializedName("urinalysis")
    @Expose
    private String urinalysis;
    @SerializedName("date")
    @Expose
    private String date;

    public String getUrinalysis() {
        return urinalysis;
    }

    public void setUrinalysis(String urinalysis) {
        this.urinalysis = urinalysis;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
