package com.entity;

import java.util.List;

public class UserInfoVO {

    private List<UserInfo> userInfos;

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    @Override
    public String toString() {
        return "UserInfoVO{" +
                "userInfos=" + userInfos +
                '}';
    }
}
