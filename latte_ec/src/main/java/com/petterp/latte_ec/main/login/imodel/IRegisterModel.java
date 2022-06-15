package com.petterp.latte_ec.main.login.imodel;

/**
 * 创建新账号
 *
 * 
 *
 */
public interface IRegisterModel {
    /**
     * 手机号码
     * @param phone
     */
    void createUser(String phone);



    void createCode(String res);

    String getPhone();
}
