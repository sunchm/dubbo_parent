package com.suncm.dao.login;

import com.suncm.api.login.Account;

import java.util.Map;

/**
 * Created by sunchangming on 2017/11/20.
 */
public interface LoginDao {

    //查询用户信息
    Account queryAccount(Map<String, Object> data);
}
