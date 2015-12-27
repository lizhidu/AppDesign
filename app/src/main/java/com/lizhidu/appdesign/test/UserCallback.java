package com.lizhidu.appdesign.test;

import com.google.gson.Gson;
import com.lizhidu.appdesign.net.callback.Callback;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by zhy on 15/12/14.
 */
public abstract class UserCallback extends Callback<User>
{
    @Override
    public User parseNetworkResponse(Response response) throws IOException
    {
        String string = response.body().string();

        User user = new Gson().fromJson(string, User.class);
        return user;
    }


}
