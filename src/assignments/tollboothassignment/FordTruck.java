package assignments.tollboothassignment;

/**
 * FordTruck.java , NissanTruck.java , Daewootruck.java
 * An implementation of the Truck interface, representing different trucks.
 * axles The number of axles for the truck.
 * weight The total weight of the truck in kilograms.
 */

class FordTruck implements ITruck {
    private final int axles;
    private final int weight;
    private final String make = "Ford";

    //Constructor   
    public FordTruck(int axles, int weight) {
        this.axles = axles;
        this.weight = weight;
    }

    @Override
    public int getAxles() {
        return axles;
    }

    @Override
    public int getWeight() {
        return weight;
    }
    
    @Override
    public String getMake() {
        return make;
    }
}


class NissanTruck implements ITruck {
    private final int axles;
    private final int weight;
    private final String make = "Nissan";

    // Constructor 
    public NissanTruck(int axles, int weight) {
        this.axles = axles;
        this.weight = weight;
    }

    @Override
    public int getAxles() {
        return axles;
    }

    @Override
    public int getWeight() {
        return weight;
    }
    
    @Override
    public String getMake() {
        return make;
    }
}


class DaewooTruck implements ITruck {
    private final int axles;
    private final int weight;
    private final String make = "Daewoo";

    // Constructor
    public DaewooTruck(int axles, int weight) {
        this.axles = axles;
        this.weight = weight;
    }

    @Override
    public int getAxles() {
        return axles;
    }

    @Override
    public int getWeight() {
        return weight;
    }
    
    @Override
    public String getMake() {
        return make;
    }
}

