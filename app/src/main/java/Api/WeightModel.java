package Api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeightModel {

        @SerializedName("weight")
        @Expose
        private String weight;
        @SerializedName("date")
        @Expose
        private String date;

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

    }
