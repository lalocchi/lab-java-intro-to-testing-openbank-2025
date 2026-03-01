package com.ironhack;

public class Wizard extends Player {
    String spell;
    private SpellLibrary spellLibrary; // Mockito üçün

    public Wizard(int health, int lives, int strength, String spell, SpellLibrary lib) {
        super(health,  lives , strength);
        this.spell = spell;
        this.spellLibrary = lib;
    }

    public String castRandomSpell() {
        return "Casting " + spellLibrary.getRandomSpell();
    }
}
