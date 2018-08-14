package com.example.arial.mvvm.web;

import com.example.arial.mvvm.web.request.LoginReq;
import com.example.arial.mvvm.web.response.Result;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by huyong on 2018/3/13.
 */
public interface RequestInterface {

    @POST("shop/login")
    Call<Result> login(@Body LoginReq req);
}
