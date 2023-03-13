package com.bsb.taller.utils.emuns;

public enum StatusMechanic {
    LICENCIA("l"),
    BAJA("b"),
    ALTA("a");
    private String STATUS_MECHANIC ="ROL_";
    private final String name ;
    StatusMechanic(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getFullRoleName() {return STATUS_MECHANIC + name();}
}
