package com.suncm.controller.handlers;

import com.suncm.entity.Request;
import com.suncm.entity.Response;

/**
 * Created by sunchangming on 2017/11/20.
 */
public abstract class CommandHandler {

    public static String RE_SUCCESS = "0200";// 服务器处理成功

    public Response handle(Request request, Response response) throws Exception {
        if(paramValidate(request, response)){
            process(request, response);//需要设置resultCode
        }
        return response;
    }

    //参数验证
    protected abstract boolean paramValidate(Request request, Response response);

    //处理具体业务
    protected abstract void process(Request request, Response response) throws Exception;
}
