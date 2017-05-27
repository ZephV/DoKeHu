package com.zeph.dokehu.app;


import okhttp3.OkHttpClient;
import okhttp3.Request;

public class OkHttpUtil {

  public static void OkHttpSendRequest(okhttp3.Callback callback) {

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder().url("").build();

    client.newCall(request).enqueue(callback);
  }
}
