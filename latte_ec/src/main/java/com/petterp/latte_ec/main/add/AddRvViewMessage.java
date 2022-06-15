package com.petterp.latte_ec.main.add;

/**
 *
 * Summary:
 *
 */
public class AddRvViewMessage {
    private AddItemFileds mode;
    private int position;

    public AddRvViewMessage(AddItemFileds mode) {
        this.mode = mode;
    }

    public AddRvViewMessage(AddItemFileds mode, int position) {
        this.mode = mode;
        this.position = position;
    }

    public AddItemFileds getMode() {
        return mode;
    }

    public int getPosition() {
        return position;
    }
}
