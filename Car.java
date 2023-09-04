public class Car extends Vehicle {

    //private field
    private String brand;

    //default constructor
    public Car(){
        brand = "Mazda";
    }

    public void honk() {
        System.out.println("Honk, honk!");
    }

    //getter
    public String getBrand() {
        return brand;
    }

    //setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //displays all data pertaining to obj
    public void displayInfo() {
        System.out.println("\tColor: " + color);
        System.out.println("\tEngine Size: " + engineSize);
        System.out.println("\tNumber of Wheels: " + numberOfWheels);
        System.out.println("\tFuel Type: " + fuelType);
        System.out.println("\tBrand: " + brand);
    }


}
