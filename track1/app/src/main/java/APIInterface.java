import com.bdg.telkom.track1.tesAct;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by lacorp on 5/23/2016.
 */
public interface APIInterface {
    @POST("users")
    Call<tesAct> getAllUser();
}