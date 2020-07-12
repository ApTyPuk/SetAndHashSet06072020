package com.Artur;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Set<Object> bodyType;


    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = new HashSet<>();
    }

    public Set<Object> getBodyType() {
        return bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addMoon(HeavenlyBody moon){

        if(this.bodyType.contains("PLANET") && moon.getBodyType().contains("MOON") ){
//            System.out.println("moon has been added.");
            return this.satellites.add(moon);
        }
//        System.out.println("This Heavenly Body is not planet!!!!");
        return false;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
        if ( (obj == null) || (obj.getClass() != this.getClass()) ){
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return  this.name.equals(objName);
    }


    @Override
    public int hashCode() {
//        System.out.println("hashcode called");
        return this.name.hashCode() +57;
    }


}
