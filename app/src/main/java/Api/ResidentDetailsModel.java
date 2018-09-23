package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResidentDetailsModel {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("msg")
    @Expose
    private List<MsgModel> msg = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<MsgModel> getMsg() {
        return msg;
    }

    public void setMsg(List<MsgModel> msg) {
        this.msg = msg;
    }

}