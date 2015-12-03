package com.liteutil.android.http.listener;


import com.liteutil.android.http.request.UriRequest;

/**
 * Created by wyouflf on 15/11/10.
 * 拦截请求响应(在后台线程工作).
 * <p>
 * 用法: 请求的callback参数同时实现InterceptRequestListener
 */
public interface InterceptRequestListener {

    void beforeRequest(UriRequest request) throws Throwable;

    void afterRequest(UriRequest request) throws Throwable;
}