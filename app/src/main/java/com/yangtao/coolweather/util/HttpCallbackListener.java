package com.yangtao.coolweather.util;

/**
 * Created by Yangtao on 2016/5/19.
 */
public interface HttpCallbackListener {
    void onFinish (String response);

    void onError(Exception e);
}
