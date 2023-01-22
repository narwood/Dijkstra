package a6;

public class DikObj {

    private String name;
    private double distance;

    public DikObj(String n, double d) {
        name = n;
        distance = d;
    }

    public DikObj() {
        name = "";
        distance = -1.0;
    }

    public String getName() {return name;}

    public double distance() {return distance;}

    public void setName(String newName) {name = newName;}

    public void setDistance(double newDist) {distance = newDist;}

}
