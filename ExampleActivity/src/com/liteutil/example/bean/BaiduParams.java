package com.liteutil.example.bean;


import java.util.ArrayList;
import java.util.List;

import com.liteutil.annotation.HttpRequest;
import com.liteutil.http.request.DefaultParamsBuilder;
import com.liteutil.http.request.RequestParams;

/**
 * Created by wyouflf on 15/11/4.
 */
@HttpRequest(
        host = "https://www.baidu.com",
        path = "s",
        builder = DefaultParamsBuilder.class/*可选参数, 控制参数构建过程, 定义参数签名, SSL证书等*/)
public class BaiduParams extends RequestParams {
    public String wd;

    // 数组参数 aa=1&aa=2&aa=4
    public int[] aa = new int[]{1, 2, 4};
    public List<String> bb = new ArrayList<String>();

    public BaiduParams() {
        bb.add("a");
        bb.add("c");
    }

    //public long timestamp = System.currentTimeMillis();
    //public File uploadFile;
}
