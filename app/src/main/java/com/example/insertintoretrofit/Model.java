package com.example.insertintoretrofit;

import com.google.gson.annotations.SerializedName;

public class Model {
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    public Model(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
