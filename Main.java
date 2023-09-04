public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Vehicle myVehicle = new Vehicle();

        //altering vehicle obj's data using setters
        myVehicle.setColor("Black");
        myVehicle.setEngineSize(1200);
        myVehicle.setNumberOfWheels(4);
        myVehicle.setFuelType("Gasoline");

        //displaying vehicle obj's data using getters
        System.out.println("My Vehicle: ");
        System.out.println("\tColor: " + myVehicle.getColor());
        System.out.println("\tEngine Size: " + myVehicle.getEngineSize());
        System.out.println("\tNumber of Wheels: " + myVehicle.getNumberOfWheels());
        System.out.println("\tFuel Type: " + myVehicle.getFuelType());

        System.out.println();

        //altering car obj's data using setters
        myCar.setColor("Blue");
        myCar.setBrand("Subaru");
        myCar.setEngineSize(5000);
        myCar.setNumberOfWheels(8);
        myCar.setFuelType("Diesel");

        //using displayInfo() method in Car class
        System.out.println("My car:");
        myCar.displayInfo();

        System.out.println();
        myCar.honk();



    }

}
