package com.ironhack;

public class Warrior extends Player {
    int force;

    public Warrior(int health, int lives, int strength, int force) {
        super(health,  lives , strength);
        this.force = force;
    }

    public Elf convertToElf() {
        return new Elf(getHealth(), getStrength(), getLives(), 10);
    }
}
