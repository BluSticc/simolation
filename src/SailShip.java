public class SailShip {

    int passengers;
    double cargoCapacity;
    double speed;
    String name;
    double food;
    int crew;

    public SailShip(int passengers, double cargoCapacity, double speed, String name, double food, int crew) {
        this.passengers = passengers;
        this.cargoCapacity = cargoCapacity;
        this.speed = speed;
        this.name = name;
        this.food = food;
        this.crew = crew;
    }
// getters and setters
    public int getPassengers(int passengers) {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public double getCargoCapacity(double cargoCapacity){
        return cargoCapacity;
    }
    public void setCargoCapacity(double cargoCapacity){
        this.cargoCapacity = cargoCapacity;
    }
    public double getSpeed(double speed){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getFuel(double food){
        return food;
    }
    public void setFuel(double fuel){
        this.food = food;
    }
    public int getCrew(int crew){
        return crew;
    }
    public void setCrew(int crew){
        this.crew = crew;
    }

}
