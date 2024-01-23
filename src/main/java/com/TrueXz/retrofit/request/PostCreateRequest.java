package com.TrueXz.retrofit.request;

public class PostCreateRequest {
    private Integer userId;
    private String title;
    private String body;

    @Override
    public String toString() {
        return "PostCreateRequest{" +
                "userId=" + userId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
