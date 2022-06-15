package com.petterp.latte_ec.main.add.topViewVp.rvItems;

import com.petterp.latte_ui.recyclear.MultipleItemEntity;

import java.util.List;

/**
 *
 * Summary:
 *
 */
public interface IAddTopRvItemModel {
    List<MultipleItemEntity> consumeList();

    List<MultipleItemEntity> incomeList();


    void queryInfo();

    boolean add(String kindNew, String category);

    void delegate(String kind, String category);

    void update(String kindNew, String kind, String category);

    void setTitleMode(String mode);
}
