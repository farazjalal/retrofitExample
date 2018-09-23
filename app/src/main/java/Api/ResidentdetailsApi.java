package Api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ResidentdetailsApi {
    @FormUrlEncoded
    @POST("service.php")
    Call<ResidentDetailsModel> getValues(@Field("func") String func);
}
