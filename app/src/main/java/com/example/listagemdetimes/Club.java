package com.example.listagemdetimes;

public class Club {

    private String name;
    private int logoResId;

    public Club(String name, int logoResId) {
        this.name = name;
        this.logoResId = logoResId;
    }

    public String getName() {
        return name;
    }

    public int getLogoResId() {
        return logoResId;
    }
}
