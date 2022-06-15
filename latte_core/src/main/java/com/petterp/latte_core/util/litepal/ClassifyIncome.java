package com.petterp.latte_core.util.litepal;

import org.litepal.crud.LitePalSupport;

/**
 *
 * Summary:
 *
 */
public class ClassifyIncome extends LitePalSupport {
    private String icon;
    private String kind;
    private String mode;
    public ClassifyIncome(){

    }
    public ClassifyIncome(String icon, String kind, String mode) {
        this.icon = icon;
        this.kind = kind;
        this.mode = mode;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
