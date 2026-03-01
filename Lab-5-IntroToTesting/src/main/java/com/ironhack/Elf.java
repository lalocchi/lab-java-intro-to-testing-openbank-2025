package com.ironhack;

public class Elf extends Player {
    int speed;

    public Elf(int health, int lives, int strength, int speed) {
        super(health,  lives , strength);
        this.speed = speed;
    }
}
