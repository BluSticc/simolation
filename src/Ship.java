public class Ship {

    int passengers;
    double cargoCapacity;
    double speed;
    String name;
    double fuel;
    int crew;

    public Ship(int passengers, double cargoCapacity, double speed, String name, double fuel, int crew) {
        this.passengers = passengers;
        this.cargoCapacity = cargoCapacity;
        this.speed = speed;
        this.name = name;
        this.fuel = fuel;
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
    public double getFuel(double fuel){
        return fuel;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public int getCrew(int crew){
        return crew;
    }
    public void setCrew(int crew){
        this.crew = crew;
    }

}
