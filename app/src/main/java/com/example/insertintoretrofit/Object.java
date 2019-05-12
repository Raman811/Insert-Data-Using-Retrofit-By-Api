package com.example.insertintoretrofit;

import com.google.gson.annotations.SerializedName;

public class Object {

//    @SerializedName("user_id")
//    private String user_id;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

   @SerializedName("category_id")
    private String category_id;

    public Object(String title, String description, String category_id) {
        this.title = title;
        this.description = description;
        this.category_id = category_id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }
}
