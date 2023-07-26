package com.factory;


import com.squareup.okhttp.OkHttpClient;

public class OkHttpFactory {
    private static OkHttpClient okHttpClientInstance;
    public static OkHttpClient getInstance(){
        if (okHttpClientInstance==null){
            okHttpClientInstance=new OkHttpClient();
        }
        return okHttpClientInstance;
    }

}
