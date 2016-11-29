package com.mpdam.emeni.googlemapssearchnearby;

import  com.mpdam.emeni.googlemapssearchnearby.POJO.Example;

/**
 * Created by Emeni on 28/11/2016.
 */

        import retrofit.Call;
        import retrofit.http.GET;
        import retrofit.http.Query;


public interface RetrofitMaps {

    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
     */
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk")
    Call<Example> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);

}

