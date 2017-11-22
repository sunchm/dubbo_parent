package com.suncm.serviceimpl.login;

import com.alibaba.dubbo.config.annotation.Service;
import com.suncm.api.login.Account;
import com.suncm.dao.login.LoginDao;
import com.suncm.service.login.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by sunchangming on 2017/11/20.
 */
@Service(version = "1.0.0")
public class LoginServiceImpl implements LoginService {

    private static final Logger logger = LoggerFactory.getLogger("LoginServiceImpl");

    @Autowired
    LoginDao loginDao;

    @Override
    public Account queryAccount(Map<String, Object> data) {
        Account account = loginDao.queryAccount(data);
        logger.info("用户信息:::" + account.toString());
        return account;
    }
}
