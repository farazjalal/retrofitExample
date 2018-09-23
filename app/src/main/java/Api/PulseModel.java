package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PulseModel {


        @SerializedName("pulse")
        @Expose
        private String pulse;
        @SerializedName("date")
        @Expose
        private String date;

        public String getPulse() {
            return pulse;
        }

        public void setPulse(String pulse) {
            this.pulse = pulse;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

    }
