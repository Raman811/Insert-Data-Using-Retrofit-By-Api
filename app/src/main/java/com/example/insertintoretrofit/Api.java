package com.example.insertintoretrofit;

import android.widget.EditText;

import java.util.Observable;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Api {
   String BASE_URL = "http://112.196.33.92/erin/";

   @POST("api/feeds/add")
   Call<Model> AddStudent(@Body Object user);
}
