package com.suncm.api.login;

import java.io.Serializable;

/**
 * Created by sunchangming on 2017/11/20.
 */
public class Account implements Serializable {
    private String account;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
