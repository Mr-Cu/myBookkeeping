package com.petterp.latte_ui.recyclear;

import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;

/**
 *
 * Summary:简单Holder
 *
 */
public class MultipleViewHolder extends BaseViewHolder {
    private MultipleViewHolder(View view) {
        super(view);
    }

    static MultipleViewHolder create(View view) {
        return new MultipleViewHolder(view);
    }
}
