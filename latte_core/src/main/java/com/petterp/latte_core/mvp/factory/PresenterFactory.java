package com.petterp.latte_core.mvp.factory;


import com.petterp.latte_core.mvp.presenter.BasePresenter;
import com.petterp.latte_core.mvp.view.IBaseView;

/**
 * Presenter工厂接口 ->创建Presenter
 * 
 *
 */
public interface PresenterFactory <V extends IBaseView,P extends BasePresenter<V>>{


    /**
     * 创建Presenter
     * @return p(presenter)
     */
    P createPresenter();

}
