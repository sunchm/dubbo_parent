package com.suncm.service.login;

import com.suncm.api.login.Account;

import java.util.Map;

/**
 * Created by sunchangming on 2017/11/20.
 */
public interface LoginService {
    Account queryAccount(Map<String, Object> data);
}
