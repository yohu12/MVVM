package com.example.arial.mvvm.web.request;

/**
 * Created by huyong on 2018/3/14.
 */
public class LoginReq {

    private String userName;

    private String userPwd;

    public LoginReq() {
    }

    public LoginReq(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
