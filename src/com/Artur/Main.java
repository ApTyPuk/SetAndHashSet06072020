package com.Artur;

import javafx.scene.transform.Shear;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.lang.management.MonitorInfo;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody pluto = new Planet("Pluto", 842);
        solarSystem.put(pluto.getName(), pluto);
        planets.add(pluto);

        //Test fot BetaMinor Planet and Moon.
        Planet betaMinor = new Planet("BetaMinor", 100);
        planets.add(betaMinor);
        Moon betaMinor1 = new Moon("BetaMinor", 99);
        betaMinor.addMoon(betaMinor1);
        //END OF TEST


        Planet earth = new Planet("Earth", 100);
        planets.add(earth);
        solarSystem.put(earth.getName(), earth);

        System.out.println("Planets:");
        int i = 1;
        for(HeavenlyBody planet : planets){
            System.out.println("\t"+ i+ " "+ planet.getName() + ": " + planet.getBodyType());
            i++;
        }

        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of "+ body.getName());
        for(HeavenlyBody satellite : body.getSatellites()){
            System.out.println("\t" + satellite.getName() +": " + satellite.getBodyType());
        }


        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All Moons: ");
        for(HeavenlyBody moon : moons){
            System.out.println("\t"+ moon.getName() +": " + moon.getBodyType());
        }


        System.out.println("New list of planets:");
        i=1;
        for(HeavenlyBody planet : planets){
            System.out.println(i + " " + planet.getName() +": "+ planet.getOrbitalPeriod());
//            System.out.println(i + " " + planet.getName());
            i++;
        }

        System.out.println(pluto.hashCode());

        System.out.println(temp.equals(temp));

        System.out.println(temp.equals(pluto));
        System.out.println(pluto.equals(temp));

        Set<String> solarBodies = new HashSet<>();
        solarBodies.addAll(solarSystem.keySet());
        i=1;
        for(String bodies : solarBodies){
            System.out.println(i +" "+bodies+" "+ solarSystem.get(bodies).getOrbitalPeriod());
            i++;
        }




    }
}


