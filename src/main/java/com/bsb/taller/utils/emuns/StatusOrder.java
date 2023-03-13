package com.bsb.taller.utils.emuns;

public enum StatusOrder {
    PROCESSES("PROCESSES"),
    CONFIRMED("CONFIRMED"),
    REFUSED("REFUSED");


    private final String name ;
    StatusOrder(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
