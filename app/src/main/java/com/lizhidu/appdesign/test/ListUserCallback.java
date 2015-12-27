package com.lizhidu.appdesign.test;

import com.google.gson.Gson;
import com.lizhidu.appdesign.net.callback.Callback;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

/**
 * Created by zhy on 15/12/14.
 */
public abstract class ListUserCallback extends Callback<List<User>>
{
    @Override
    public List<User> parseNetworkResponse(Response response) throws IOException
    {
        String string = response.body().string();
        List<User> user = new Gson().fromJson(string, List.class);
        return user;
    }


}
