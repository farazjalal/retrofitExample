package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RespirationModel {
        @SerializedName("respiration")
        @Expose
        private String respiration;
        @SerializedName("date")
        @Expose
        private String date;

        public String getRespiration() {
            return respiration;
        }

        public void setRespiration(String respiration) {
            this.respiration = respiration;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

    }