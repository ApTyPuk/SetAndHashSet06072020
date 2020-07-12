package com.Artur;

public class Moon extends HeavenlyBody{
    private final String bodyTypeName = "MOON";

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        super.getBodyType().add(this.bodyTypeName);
    }

    public String getBodyTypeName() {
        return bodyTypeName;
    }


}
