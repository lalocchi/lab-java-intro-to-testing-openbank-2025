package com.ironhack;

public abstract class Player {
    private int health;
    private int lives;
    private int strength;
    private int originalHealth;

    public Player(int health, int lives, int strength) {
        this.health = health;
        this.lives = lives;
        this.strength = strength;
        this.originalHealth = health;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }


    public static int[] getOddNumbers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) count++;
        }

        int[] odds = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                odds[index] = i;
                index++;
            }
        }
        return odds;
    }

    public static boolean hasJavaKeyword(String sentence) {
        String[] keywords = {"boolean", "byte", "char", "double", "float", "int", "long", "short",
                "break", "case", "continue", "default", "do", "else", "for", "if", "switch", "while",
                "catch", "finally", "throw", "throws", "try",
                "abstract", "final", "native", "static", "strictfp", "synchronized", "transient", "volatile",
                "class", "extends", "implements", "instanceof", "interface", "new", "super", "this",
                "private", "protected", "public", "import", "module", "package", "requires",
                "assert", "enum", "return", "void", "var", "null", "true", "false", "const", "goto"};
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i = i + 1) {
            String word = words[i];
            {
                for (int j = 0; j < keywords.length; j = j + 1) {
                    if (word.equals(keywords[j])) {
                        return true;
                    }
                }
            }
        }return false;
    }
    public void decrementLive () {
        this.lives = this.lives - 1;
        if (lives <= 0) {
            System.out.println("This character is dead");
        } else {
            this.health = this.originalHealth; //
        }
    }

    public void attack (Player playerToAttack){
        int damage = this.strength;
        int newHealth = playerToAttack.getHealth() - this.strength;
        playerToAttack.setHealth(newHealth);
        playerToAttack.checkHealth();
        System.out.println("Damage made is: " + damage);
        System.out.println( "New health of your player is: " + newHealth);
    }
    public void checkHealth () {
        if (this.health <= 0) {
            decrementLive();
        }
    }
}


