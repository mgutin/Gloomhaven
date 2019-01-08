package com.example.mgutin.gloomhaven;

public enum Status {
    MUDDLE("Muddle"), CURSE("Curse"), POISON("Poison"), WOUND("Wound"), STRENGTHEN("Strengthen"), BLESS("Bless");

    public String name;
    Status(String name){
        this.name = name;
    }
}
