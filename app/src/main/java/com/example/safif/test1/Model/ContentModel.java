package com.example.safif.test1.Model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class ContentModel {

    @SerializedName("_id")
    private String _id;
    @SerializedName("id_content")
    private String id_content;
    @SerializedName("name_user")
    private String name_user;
    @SerializedName("content")
    private String content;
    @SerializedName("image_prof")
    private String image_prof;
    @SerializedName("review")
    private Integer review;
    @SerializedName("date_content")
    private String date_content;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getId_content() {
        return id_content;
    }

    public void setId_content(String id_content) {
        this.id_content = id_content;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage_prof() {
        return image_prof;
    }

    public void setImage_prof(String image_prof) {
        this.image_prof = image_prof;
    }

    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    public String getDate_content() {
        return date_content;
    }

    public void setDate_content(String date_content) {
        this.date_content = date_content;
    }

    public ContentModel(String _id, String id_content, String name_user, String content, String image_prof, Integer review, String date_content){
        this._id = _id;
        this.id_content = id_content;
        this.name_user = name_user;
        this.content = content;
        this.image_prof = image_prof;
        this.review = review;
        this.date_content = date_content;
    }


}
