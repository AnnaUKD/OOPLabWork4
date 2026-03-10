class Main {
  public static void main(String[] args) {
    Transport[] vehicles = new Transport[3];

    Car car = new Car();
    car.brand = "Toyota";
    car.model = "Camry";
    car.year = 2021;
    car.passengerCount = 5;


    car.getPassengerCount();
    car.move();


    Truck truck = new Truck();
    truck.brand = "Volvo";
    truck.model = "FH16";
    truck.year = 2019;
    truck.cargoCapacity = 20;


    truck.getCargoCapacity();
    truck.move();


    Bike bike = new Bike();
    bike.brand = "Honda";
    bike.model = "CBR";
    bike.year = 2023;
    bike.engineVolume = 600;


    bike.getEngineVolume();
    bike.move();


    vehicles[0] = car;
    vehicles[1] = truck;
    vehicles[2] = bike;

    for (Transport t : vehicles) {
      t.getInfo();
      System.out.println("\n");
    }
  }
}