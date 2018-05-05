package com.shopback.githubusers.interfaces;

/**
 * Created by Koushik on 5/5/2018.
 */
public interface IAPIModule {

    void getAllUsers(String since);
    public void getUserDetail(String userName);

}
