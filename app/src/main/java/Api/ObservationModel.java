package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ObservationModel {
    @SerializedName("bloodpressure")
    @Expose
    private BloodpressureModel bloodpressure;
    @SerializedName("pulse")
    @Expose
    private PulseModel pulse;
    @SerializedName("temperature")
    @Expose
    private TemperatureModel temperature;
    @SerializedName("sp02")
    @Expose
    private Sp02Model sp02;
    @SerializedName("weight")
    @Expose
    private WeightModel weight;
    @SerializedName("height")
    @Expose
    private HeightModel height;
    @SerializedName("respiration")
    @Expose
    private RespirationModel respiration;
    @SerializedName("bmi")
    @Expose
    private BmiModel bmi;
    @SerializedName("urinalysis")
    @Expose
    private UrinalysisModel urinalysis;
    @SerializedName("bloodglucose")
    @Expose
    private BloodglucoseModel bloodglucose;

    public BloodpressureModel getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(BloodpressureModel bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public PulseModel getPulse() {
        return pulse;
    }

    public void setPulse(PulseModel pulse) {
        this.pulse = pulse;
    }

    public TemperatureModel getTemperature() {
        return temperature;
    }

    public void setTemperature(TemperatureModel temperature) {
        this.temperature = temperature;
    }

    public Sp02Model getSp02() {
        return sp02;
    }

    public void setSp02(Sp02Model sp02) {
        this.sp02 = sp02;
    }

    public WeightModel getWeight() {
        return weight;
    }

    public void setWeight(WeightModel weight) {
        this.weight = weight;
    }

    public HeightModel getHeight() {
        return height;
    }

    public void setHeight(HeightModel height) {
        this.height = height;
    }

    public RespirationModel getRespiration() {
        return respiration;
    }

    public void setRespiration(RespirationModel respiration) {
        this.respiration = respiration;
    }

    public BmiModel getBmi() {
        return bmi;
    }

    public void setBmi(BmiModel bmi) {
        this.bmi = bmi;
    }

    public UrinalysisModel getUrinalysis() {
        return urinalysis;
    }

    public void setUrinalysis(UrinalysisModel urinalysis) {
        this.urinalysis = urinalysis;
    }

    public BloodglucoseModel getBloodglucose() {
        return bloodglucose;
    }

    public void setBloodglucose(BloodglucoseModel bloodglucose) {
        this.bloodglucose = bloodglucose;
    }

}
