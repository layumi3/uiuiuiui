import retrofit2.Retrofit;

/**
 * Created by lacorp on 5/23/2016.
 */
public class BaseAPI {

    public static final String BASE_URL = "http://cerita-aje.es.sy/";
    public static Retrofit retrofit = null;

    public static Retrofit getBaseURL(){
//        if (retrofit == null){
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
        return retrofit;
    }
}
