package com.test;

public enum Application {
    APP1("Appinfo 1"),
    APP2("Appinfo 2"),
    APP3("Appinfo 3");

    private final String info;

    private Application(String str){
        this.info = str;
    }
    
    public String getInfo() {
        return this.info;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
