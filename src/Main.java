class Main {
  public static void main(String[] args) {


    Car car = new Car("Машина", "Toyota", "Camry", 2021, 5);
    car.getPassengerCount();
    car.move();


    Truck truck = new Truck("Вантажівка","Volvo", "FH16", 2019, 20);
    truck.getCargoCapacity();
    truck.move();


    Bike bike = new Bike("Мотоцикл","Honda", "CBR", 2023, 600);
    bike.getEngineVolume();
    bike.move();


    Bus bus = new Bus("Автобус","Mercedes", "CBR", 2024, 200);
    bus.getPassengerCapacity();
    bus.move();


    Scooter scooter = new Scooter("Скутер","BMW", "X8", 2015, 187.5);
    scooter.getSpeed();
    scooter.move();


    Transport[] vehicles = {car, truck, bike, bus, scooter};

    for (Transport transporter : vehicles) {
      System.out.println("\n");
      transporter.getInfo();
      System.out.println("\n");
    }

  }
}