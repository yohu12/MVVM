package com.example.arial.mvvm.module;

import android.content.Context;

import com.arialyy.frame.http.HttpUtil;
import com.arialyy.frame.module.AbsModule;
import com.example.arial.mvvm.config.Constance;
import com.example.arial.mvvm.databinding.ActivityAbsBinding;
import com.example.arial.mvvm.web.RetrofitFactory;
import com.example.arial.mvvm.web.request.LoginReq;
import com.example.arial.mvvm.web.response.Result;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by lyy on 2016/4/6.
 */
public class IPModule extends AbsModule {
  private static final String IP_URL =
      "http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&ip=";

  public IPModule(Context context) {
    super(context);
  }

  /**
   * 获取IP信息
   */
  public void getIpInfo() {
    RetrofitFactory.getInstance().login(new LoginReq("13518165184","96e79218965eb72c92a549dd5a330112")).enqueue(new Callback<Result>() {
      @Override
      public void onResponse(Call<Result> call, Response<Result> response) {

      }

      @Override
      public void onFailure(Call<Result> call, Throwable t) {

      }
    });
  }
}
