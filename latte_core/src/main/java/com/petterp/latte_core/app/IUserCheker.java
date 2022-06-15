package com.petterp.latte_core.app;

/**
 *
 * Summary:用户是否登录信息回调
 *
 */
public interface IUserCheker {
    void onSignIn();

    void onNotSoignIn();
}
