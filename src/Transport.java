class Transport {
    public String brand;
    public String model;
    public Integer year;

    public void getInfo(){
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Рік: " + year);
    }
}


class Car extends Transport{
    public Integer passengerCount;


    public void getPassengerCapacity(){
        System.out.println("Кількість можливих пасажирів: " + passengerCount);
    }
}


class Truck extends Transport{
    public Integer cargoCapacity;


    public void getCargoCapacity(){

    }

}