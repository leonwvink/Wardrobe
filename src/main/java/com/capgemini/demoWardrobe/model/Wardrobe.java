package com.capgemini.demoWardrobe.model;

public class Wardrobe {

    private String name;
    private boolean isOpen;
    private boolean inside;
    private int health;

    public Wardrobe() {}

    public Wardrobe(String name, boolean isOpen, boolean inside, int health) {
        this.name = name;
        this.isOpen = isOpen;
        this.inside = inside;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isInside() {
        return inside;
    }

    public void setInside(boolean inside) {
        this.inside = inside;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
