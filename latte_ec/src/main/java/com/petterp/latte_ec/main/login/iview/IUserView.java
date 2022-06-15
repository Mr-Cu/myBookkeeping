package com.petterp.latte_ec.main.login.iview;

import com.petterp.latte_core.mvp.view.IBaseView;

/**
 * 用户详细信息-view
 *
 * 
 *
 */
public interface IUserView extends IBaseView {

    void updateName(String name);

    void updateSex(String sex);

}
