/*
  Add the following attributes:
        numberOfWheels (integer)
        color (String)
        engineSize (float)
        fuelType (String)


    Create a constructor that sets all the attributes.
    Create getters and setters for each attribute.

 */
public class Vehicle {

    //protected fields
    protected int numberOfWheels;
    protected String color;
    protected float engineSize;
    protected String fuelType;

    //default constructor
    public Vehicle() {
        numberOfWheels = 0;
        color = "N/A";
        engineSize = 0;
        fuelType = "N/A";

    }

    //getters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }
    public float getEngineSize() {
        return engineSize;
    }
    public String getFuelType() {
        return fuelType;
    }


    //setters
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


}
