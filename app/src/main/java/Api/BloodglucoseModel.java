package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BloodglucoseModel {
    @SerializedName("glucosemeasured")
    @Expose
    private String glucosemeasured;
    @SerializedName("bloodglucose")
    @Expose
    private String bloodglucose;
    @SerializedName("bloodglucosemg")
    @Expose
    private String bloodglucosemg;
    @SerializedName("date")
    @Expose
    private String date;

    public String getGlucosemeasured() {
        return glucosemeasured;
    }

    public void setGlucosemeasured(String glucosemeasured) {
        this.glucosemeasured = glucosemeasured;
    }

    public String getBloodglucose() {
        return bloodglucose;
    }

    public void setBloodglucose(String bloodglucose) {
        this.bloodglucose = bloodglucose;
    }

    public String getBloodglucosemg() {
        return bloodglucosemg;
    }

    public void setBloodglucosemg(String bloodglucosemg) {
        this.bloodglucosemg = bloodglucosemg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}