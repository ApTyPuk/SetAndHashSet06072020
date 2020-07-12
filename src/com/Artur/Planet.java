package com.Artur;

public class Planet extends HeavenlyBody {
    private final String bodyTypeName = "PLANET";

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        super.getBodyType().add(this.bodyTypeName);
    }

    public String getBodyTypeName() {
        return bodyTypeName;
    }

    @Override
    public String toString() {
        return "Name: " +super.getName() + ", "
                + "Orbital period: " +super.getOrbitalPeriod()+ ", "
                + "Body type: " + this.bodyTypeName + ".";
    }


}
