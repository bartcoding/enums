package be.intecbrussel.enums;

import java.util.Random;

//let's have fun with enums!
public class App {
    public static void main(String[] args) {
        // declare a variable called earth
        // initiate the variable so that it points to a random instance of the planet enum
        Planet planet = getRandomPlanet();
        //if the planet is earth, we are home
        Planet.EARTH.setRadius(3303);
        System.out.println("the planet we are on: " + planet);
        System.out.println("the radius of this planet is: " + planet.getRadius());

    }

    //selects a random planet from the list of available planets
    private static Planet getRandomPlanet() {
        // get a list with the available planets
        Planet[] planets = Planet.values();
        // create a Random object
        Random random = new Random();
        // generate a random number between 0 and the length of the planets array
        int randomPlanetIndex = random.nextInt(planets.length);
        // return the planet on the generated index
        return planets[randomPlanetIndex];
    }
}
