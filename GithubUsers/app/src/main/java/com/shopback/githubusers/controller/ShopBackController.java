package com.shopback.githubusers.controller;

import android.content.Context;

import com.shopback.githubusers.interfaces.IAPIListener;

/**
 * Created by Koushik on 5/5/2018.
 */
public class ShopBackController {
    protected Context mContext;


    protected IAPIListener iapiListener;

    public ShopBackController (Context context,IAPIListener iapiListener){

            rebindListener(context,iapiListener);
    }
    public void rebindListener(Context context,IAPIListener iapiListener){
            this.mContext = context;
            this.iapiListener = iapiListener;
    }



}
