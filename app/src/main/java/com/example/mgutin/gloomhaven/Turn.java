package com.example.mgutin.gloomhaven;

public class Turn {

    public Action[] actions;

    public int initiative;

    public Turn(int initiative, Action... actions){
        this.initiative = initiative;
        this.actions = actions;
    }
}
