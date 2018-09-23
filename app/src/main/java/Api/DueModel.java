package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DueModel {
    @SerializedName("duename")
    @Expose
    private String duename;
    @SerializedName("dues")
    @Expose
    private Integer dues;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("duetime")
    @Expose
    private List<DuetimeModel> duetime = null;
    @SerializedName("lastdate")
    @Expose
    private String lastdate;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("size")
    @Expose
    private String size;

    public String getDuename() {
        return duename;
    }

    public void setDuename(String duename) {
        this.duename = duename;
    }

    public Integer getDues() {
        return dues;
    }

    public void setDues(Integer dues) {
        this.dues = dues;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<DuetimeModel> getDuetime() {
        return duetime;
    }

    public void setDuetime(List<DuetimeModel> duetime) {
        this.duetime = duetime;
    }

    public String getLastdate() {
        return lastdate;
    }

    public void setLastdate(String lastdate) {
        this.lastdate = lastdate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
