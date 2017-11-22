package com.suncm.controller.handlers.login;

import com.alibaba.dubbo.config.annotation.Reference;
import com.suncm.api.login.Account;
import com.suncm.controller.handlers.CommandHandler;
import com.suncm.entity.Request;
import com.suncm.entity.Response;
import com.suncm.service.login.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

public class LoginController extends CommandHandler{

    private static final Logger logger = LoggerFactory.getLogger("LoginController");

    @Reference(version = "1.0.0")
    LoginService loginService;

    @Override
    protected boolean paramValidate(Request request, Response response) {
        return true;
    }

    @Override
    protected void process(Request request, Response response) throws Exception {
        Map<String, Object> data = request.getData();
        Account account = loginService.queryAccount(data);
        logger.info("登陆成功:" + account.getPhone());

        response.getData().put("phone", account.getPhone());
        response.setResultCode(RE_SUCCESS);
    }
}
