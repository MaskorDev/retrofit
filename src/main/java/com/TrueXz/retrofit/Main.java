package com.TrueXz.retrofit;

import com.TrueXz.retrofit.request.PostCreateRequest;
import com.TrueXz.retrofit.request.PostUpdateRequest;
import com.TrueXz.retrofit.response.PostResponse;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");

        JsonPlaceholderApi api = JsonPlaceholderService.getInstance().api();

        System.out.println("GET: /posts -------------");
        Response<List<PostResponse>> postResponses = api.posts(null).execute();

        System.out.println(postResponses.isSuccessful());
        System.out.println(postResponses.code());
        System.out.println(postResponses.headers());
        List<PostResponse> posts = postResponses.body();
        System.out.println(posts);

        System.out.println("POST: /posts -------------");
        PostCreateRequest postCreateRequest = new PostCreateRequest();
        postCreateRequest.setBody("body");
        postCreateRequest.setTitle("title");
        postCreateRequest.setUserId(101);
        PostResponse postResponse = api.create(postCreateRequest).execute().body();
        System.out.println(postResponse);

        System.out.println("PUT: /posts -------------");
        PostUpdateRequest postUpdateRequest = new PostUpdateRequest();
        postUpdateRequest.setBody("update");
        postUpdateRequest.setUserId(1);
        postUpdateRequest.setId(1);
        postUpdateRequest.setTitle("update");
        PostResponse postResponse1 = api.update(1, postUpdateRequest).execute().body();
        System.out.println(postResponse1);

        System.out.println("DELETE: /posts -------------");
        System.out.println(api.delete(1).execute());
    }
}
