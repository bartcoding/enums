package be.intecbrussel.enums;

public enum Planet {
    //list of planet radiuses(size):
    //Mercury: 2439km,Earth: 6371km, Mars: 3389km
    //Venus: 6051km,saturn:58232km,jupiter:69911km
    //Uranus:25362km, neptune: 24622km

    MERCURY(2439), VENUS(6051),
    EARTH(6371), MARS(3389),
    JUPITER(69911), NEPTUNE(24622),
    SATURN(58232), URANUS(25362);
    private int radius;
    Planet(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Planet{ name=" + this.name() +"\n" +
                "radius=" + radius +
                '}';
    }
}
