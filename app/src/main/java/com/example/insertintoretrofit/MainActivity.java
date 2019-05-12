package com.example.insertintoretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    EditText title, enteryourfeed;
    ImageView back, image_one, image_two, image_third, image_four, image_five;
    Button cancel, post;

    String[] List = {"General", "Absent/Selected", "News"};
    Object object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        title = findViewById(R.id.et_title);
        enteryourfeed = findViewById(R.id.et_enteryourfeed);
        back = findViewById(R.id.image_back);
        image_one = findViewById(R.id.img1);
        image_two = findViewById(R.id.img2);
        image_third = findViewById(R.id.img3);
        image_four = findViewById(R.id.img4);
        image_five = findViewById(R.id.img5);
        post = findViewById(R.id.btn_post);
        cancel = findViewById(R.id.btn_cancel);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, List);
        spinner.setAdapter(adapter);
//
//        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
//        Call<Info> call = apiService.CALL();

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        Api api = RetrofitClient.getClient().create(Api.class);
        String s = spinner.getSelectedItem().toString();
        String t = title.getText().toString();
        String d = enteryourfeed.getText().toString();

        object = new Object(s,t, d);


        Call<Model> call = api.AddStudent(object);
        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                String i = response.body().toString();

                Toast.makeText(MainActivity.this, i, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {

            }
        });

            }
        });
//
//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//
//                String s = response.body().toString();
//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//
//                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
