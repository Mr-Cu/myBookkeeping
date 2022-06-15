package com.petterp.latte_ec.main.home;

/**
 * 
 * Summary:EvenBus HomeData Message
 * 
 */
public class HomeMessage {
    private String kind;
    private String kindNew;
    private String category;
    private HomeItemFieds homeItemFieds;

    public HomeMessage(String kind, String kindNew, String category, HomeItemFieds homeItemFieds) {
        this.kind = kind;
        this.kindNew = kindNew;
        this.category = category;
        this.homeItemFieds = homeItemFieds;
    }

    public HomeMessage(String kind, String category, HomeItemFieds homeItemFieds) {
        this.kind = kind;
        this.category = category;
        this.homeItemFieds = homeItemFieds;
    }

    public HomeMessage(HomeItemFieds homeItemFieds) {
        this.homeItemFieds = homeItemFieds;
    }

    public String getKind() {
        return kind;
    }

    public String getKindNew() {
        return kindNew;
    }

    public String getCategory() {
        return category;
    }

    public HomeItemFieds getHomeItemFieds() {
        return homeItemFieds;
    }
}
