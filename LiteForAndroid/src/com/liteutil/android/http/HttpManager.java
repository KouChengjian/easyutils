package com.liteutil.android.http;

import com.liteutil.android.http.listener.Callback;
import com.liteutil.android.http.request.params.RequestParams;

/**
 * @ClassName: HttpManager
 * @Description: http请求接口
 * @author:
 * @date:
 */
public interface HttpManager {

    /**
     * 异步GET请求
     * @param entity
     * @param callback
     * @param <T>
     * @return
     */
    <T> Callback.Cancelable get(RequestParams entity, Callback.CommonCallback<T> callback);

    /**
     * 异步POST请求
     * @param entity
     * @param callback
     * @param <T>
     * @return
     */
    <T> Callback.Cancelable post(RequestParams entity, Callback.CommonCallback<T> callback);

    /**
     * 异步请求
     * @param method
     * @param entity
     * @param callback
     * @param <T>
     * @return
     */
    <T> Callback.Cancelable request(HttpMethod method, RequestParams entity, Callback.CommonCallback<T> callback);


    /**
     * 同步GET请求
     * @param entity
     * @param resultType
     * @param <T>
     * @return
     * @throws Throwable
     */
    <T> T getSync(RequestParams entity, Class<T> resultType) throws Throwable;

    /**
     * 同步POST请求
     * @param entity
     * @param resultType
     * @param <T>
     * @return
     * @throws Throwable
     */
    <T> T postSync(RequestParams entity, Class<T> resultType) throws Throwable;

    /**
     * 同步请求
     * @param method
     * @param entity
     * @param resultType
     * @param <T>
     * @return
     * @throws Throwable
     */
    <T> T requestSync(HttpMethod method, RequestParams entity, Class<T> resultType) throws Throwable;

}
