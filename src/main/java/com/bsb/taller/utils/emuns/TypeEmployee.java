package com.bsb.taller.utils.emuns;

public enum TypeEmployee {
    ADMINISTRATION("ADMINISTRATION"),
    MECHANIC("MECHANIC"),
    RECEPTION("RECEPTION"),
    GARAGE("GARAGE"),
    CLIENT("CLIENT");

    private final String name ;
    TypeEmployee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
