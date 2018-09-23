package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sp02Model {


        @SerializedName("sp02")
        @Expose
        private String sp02;
        @SerializedName("date")
        @Expose
        private String date;

        public String getSp02() {
            return sp02;
        }

        public void setSp02(String sp02) {
            this.sp02 = sp02;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

    }

