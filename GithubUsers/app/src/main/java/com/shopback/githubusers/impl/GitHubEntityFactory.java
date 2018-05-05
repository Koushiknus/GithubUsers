package com.shopback.githubusers.impl;

import com.shopback.githubusers.entity.AllUserInfo;
import com.shopback.githubusers.entity.SingleUserInfo;

/**
 * Created by Koushik on 5/5/2018.
 */
public class GitHubEntityFactory {

    private static AllUserInfo allUserInfo;
    private static SingleUserInfo singleUserInfo;

    public static AllUserInfo getAllUserInfo(){

        if(allUserInfo == null){
            allUserInfo = new AllUserInfo();
        }
        return allUserInfo;
    }
    public static SingleUserInfo getSingleUserInfo(){

        if(singleUserInfo == null){
            singleUserInfo = new SingleUserInfo();
        }
        return singleUserInfo;
    }
}
