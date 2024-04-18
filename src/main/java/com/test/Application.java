package com.test;

import java.util.List;

public enum Application {
    APP1("Appinfo 1", List.of("Prop1", "Prop2"));
    //APP2("Appinfo 2", List.of("Prop1", "Prop2")),
    //APP3("Appinfo 3", List.of("Prop1", "Prop2"));

    private final String info;
    private final List<String> props;

    private Application(String str, List<String> props){
        this.info = str;
        this.props = props;
    }
    
    public String getInfo() {
        return this.info;
    }

    public List<String> getProps() {
        return this.props;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
