package com.shopback.githubusers.impl;

import android.content.Context;

import com.shopback.githubusers.controller.ShopBackController;
import com.shopback.githubusers.interfaces.IAPIListener;
import com.shopback.githubusers.interfaces.IAPIModule;

/**
 * Created by Koushik on 5/5/2018.
 */
public class APIModuleImpl implements IAPIModule {

    private ShopBackController shopBackController;
    private Context mContext;
    private IAPIListener iapiListener;


    private static APIModuleImpl mAPIModuleImpl;


    public static APIModuleImpl getInstance(Context context, IAPIListener iapiListener) {
        if (mAPIModuleImpl == null) {
            mAPIModuleImpl = new APIModuleImpl(context, iapiListener);

        } else {
            mAPIModuleImpl.rebindListener(context, iapiListener);

        }
        return mAPIModuleImpl;
    }
    private APIModuleImpl(Context context, IAPIListener iapiListener){
        this.mContext = context;
        this.iapiListener = iapiListener;
    }
    private void rebindListener(Context context,IAPIListener iapiListener){
        this.mContext = context;
        this.iapiListener =iapiListener;

        if(shopBackController!=null){
            shopBackController.rebindListener(context,iapiListener);
        }
    }

    @Override
    public void getAllUsers(String since) {
        
    }

    @Override
    public void getUserDetail(String userName) {

    }
}
