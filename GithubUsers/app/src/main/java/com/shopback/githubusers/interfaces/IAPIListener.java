package com.shopback.githubusers.interfaces;

import com.shopback.githubusers.entity.AllUserInfo;
import com.shopback.githubusers.entity.SingleUserInfo;

/**
 * Created by Koushik on 5/5/2018.
 */
public interface IAPIListener {

    public void getAllUserDone(boolean success,String message, AllUserInfo allUserInfo);
    public void getUserDetailDone(boolean success,String message,SingleUserInfo singleUserInfo);
}
