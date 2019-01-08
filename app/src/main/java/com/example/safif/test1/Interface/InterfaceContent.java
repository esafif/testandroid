package com.example.safif.test1.Interface;

import com.example.safif.test1.Model.ContentModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterfaceContent {
    @GET("usercontent/getcontent")
    Call<List<ContentModel>> getContent();
}
