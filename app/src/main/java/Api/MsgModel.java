package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MsgModel {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("resimage")
    @Expose
    private String resimage;
    @SerializedName("group")
    @Expose
    private String group;
    @SerializedName("bednumber")
    @Expose
    private String bednumber;
    @SerializedName("marital")
    @Expose
    private String marital;
    @SerializedName("known")
    @Expose
    private String known;
    @SerializedName("religion")
    @Expose
    private String religion;
    @SerializedName("occupation")
    @Expose
    private String occupation;
    @SerializedName("gmsnumber")
    @Expose
    private String gmsnumber;
    @SerializedName("allergies")
    @Expose
    private String allergies;
    @SerializedName("likes")
    @Expose
    private String likes;
    @SerializedName("dislikes")
    @Expose
    private String dislikes;
    @SerializedName("resid")
    @Expose
    private String resid;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("catheter")
    @Expose
    private Integer catheter;
    @SerializedName("observation")
    @Expose
    private ObservationModel observation;
    @SerializedName("diebetic")
    @Expose
    private String diebetic;
    @SerializedName("currentlocation")
    @Expose
    private String currentlocation;
    @SerializedName("diettype")
    @Expose
    private String diettype;
    @SerializedName("dependency")
    @Expose
    private String dependency;
    @SerializedName("foodallergycount")
    @Expose
    private String foodallergycount;
    @SerializedName("foodallergies")
    @Expose
    private String foodallergies;
    @SerializedName("medicineallergycount")
    @Expose
    private Integer medicineallergycount;
    @SerializedName("medicineallergies")
    @Expose
    private String medicineallergies;
    @SerializedName("dues")
    @Expose
    private List<DueModel> dues = null;
    @SerializedName("waterlowscore")
    @Expose
    private String waterlowscore;
    @SerializedName("smmsescore")
    @Expose
    private String smmsescore;
    @SerializedName("mustscore")
    @Expose
    private String mustscore;
    @SerializedName("lastdailycare")
    @Expose
    private String lastdailycare;
    @SerializedName("resusitationattempts")
    @Expose
    private String resusitationattempts;
    @SerializedName("hoistrequired")
    @Expose
    private String hoistrequired;
    @SerializedName("daypad")
    @Expose
    private Boolean daypad;
    @SerializedName("nightpad")
    @Expose
    private Boolean nightpad;
    @SerializedName("bedtime")
    @Expose
    private String bedtime;
    @SerializedName("wakeuptime")
    @Expose
    private String wakeuptime;
    @SerializedName("dressundress")
    @Expose
    private String dressundress;
    @SerializedName("bedrailexpiry")
    @Expose
    private String bedrailexpiry;
    @SerializedName("bedraillastpdatedate")
    @Expose
    private String bedraillastpdatedate;
    @SerializedName("bedrailuse")
    @Expose
    private String bedrailuse;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getResimage() {
        return resimage;
    }

    public void setResimage(String resimage) {
        this.resimage = resimage;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getBednumber() {
        return bednumber;
    }

    public void setBednumber(String bednumber) {
        this.bednumber = bednumber;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getKnown() {
        return known;
    }

    public void setKnown(String known) {
        this.known = known;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getGmsnumber() {
        return gmsnumber;
    }

    public void setGmsnumber(String gmsnumber) {
        this.gmsnumber = gmsnumber;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getDislikes() {
        return dislikes;
    }

    public void setDislikes(String dislikes) {
        this.dislikes = dislikes;
    }

    public String getResid() {
        return resid;
    }

    public void setResid(String resid) {
        this.resid = resid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCatheter() {
        return catheter;
    }

    public void setCatheter(Integer catheter) {
        this.catheter = catheter;
    }

    public ObservationModel getObservation() {
        return observation;
    }

    public void setObservation(ObservationModel observation) {
        this.observation = observation;
    }

    public String getDiebetic() {
        return diebetic;
    }

    public void setDiebetic(String diebetic) {
        this.diebetic = diebetic;
    }

    public String getCurrentlocation() {
        return currentlocation;
    }

    public void setCurrentlocation(String currentlocation) {
        this.currentlocation = currentlocation;
    }

    public String getDiettype() {
        return diettype;
    }

    public void setDiettype(String diettype) {
        this.diettype = diettype;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }

    public String getFoodallergycount() {
        return foodallergycount;
    }

    public void setFoodallergycount(String foodallergycount) {
        this.foodallergycount = foodallergycount;
    }

    public String getFoodallergies() {
        return foodallergies;
    }

    public void setFoodallergies(String foodallergies) {
        this.foodallergies = foodallergies;
    }

    public Integer getMedicineallergycount() {
        return medicineallergycount;
    }

    public void setMedicineallergycount(Integer medicineallergycount) {
        this.medicineallergycount = medicineallergycount;
    }

    public String getMedicineallergies() {
        return medicineallergies;
    }

    public void setMedicineallergies(String medicineallergies) {
        this.medicineallergies = medicineallergies;
    }

    public List<DueModel> getDues() {
        return dues;
    }

    public void setDues(List<DueModel> dues) {
        this.dues = dues;
    }

    public String getWaterlowscore() {
        return waterlowscore;
    }

    public void setWaterlowscore(String waterlowscore) {
        this.waterlowscore = waterlowscore;
    }

    public String getSmmsescore() {
        return smmsescore;
    }

    public void setSmmsescore(String smmsescore) {
        this.smmsescore = smmsescore;
    }

    public String getMustscore() {
        return mustscore;
    }

    public void setMustscore(String mustscore) {
        this.mustscore = mustscore;
    }

    public String getLastdailycare() {
        return lastdailycare;
    }

    public void setLastdailycare(String lastdailycare) {
        this.lastdailycare = lastdailycare;
    }

    public String getResusitationattempts() {
        return resusitationattempts;
    }

    public void setResusitationattempts(String resusitationattempts) {
        this.resusitationattempts = resusitationattempts;
    }

    public String getHoistrequired() {
        return hoistrequired;
    }

    public void setHoistrequired(String hoistrequired) {
        this.hoistrequired = hoistrequired;
    }

    public Boolean getDaypad() {
        return daypad;
    }

    public void setDaypad(Boolean daypad) {
        this.daypad = daypad;
    }

    public Boolean getNightpad() {
        return nightpad;
    }

    public void setNightpad(Boolean nightpad) {
        this.nightpad = nightpad;
    }

    public String getBedtime() {
        return bedtime;
    }

    public void setBedtime(String bedtime) {
        this.bedtime = bedtime;
    }

    public String getWakeuptime() {
        return wakeuptime;
    }

    public void setWakeuptime(String wakeuptime) {
        this.wakeuptime = wakeuptime;
    }

    public String getDressundress() {
        return dressundress;
    }

    public void setDressundress(String dressundress) {
        this.dressundress = dressundress;
    }

    public String getBedrailexpiry() {
        return bedrailexpiry;
    }

    public void setBedrailexpiry(String bedrailexpiry) {
        this.bedrailexpiry = bedrailexpiry;
    }

    public String getBedraillastpdatedate() {
        return bedraillastpdatedate;
    }

    public void setBedraillastpdatedate(String bedraillastpdatedate) {
        this.bedraillastpdatedate = bedraillastpdatedate;
    }

    public String getBedrailuse() {
        return bedrailuse;
    }

    public void setBedrailuse(String bedrailuse) {
        this.bedrailuse = bedrailuse;
    }

}
