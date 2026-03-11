class Transport {
    public String typeOfTransport;
    public String brand;
    public String model;
    public int year;

    public Transport(String typeOfTransport, String brand, String model, int year) {
        this.typeOfTransport = typeOfTransport;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void getInfo(){
        System.out.println("Тип транспорту: " + typeOfTransport + ", Марка: " + brand + ", Модель: " + model + ", Рік: " + year);
    }


    public void move(){
        System.out.println("Транспорт рухається....");
    }
}


class Car extends Transport {
    public int passengerCount;

    public Car(String typeOfTransport, String brand, String model, int year,  int passengerCount) {
        super(typeOfTransport, brand, model, year);
        this.passengerCount = passengerCount;
    }

    public void getPassengerCount(){
        System.out.println("Кількість можливих пасажирів: " + passengerCount);
    }


    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Кількість можливих пасажирів: " + passengerCount);
    }

    @Override
    public void move(){
        System.out.println("Автомобіль їде по дорозі....");
    }
}


class Truck extends Transport {
    public int cargoCapacity;

    public Truck(String brand, String model, int year, int cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public void getCargoCapacity(){
        System.out.println("Місткість вантажу: " + cargoCapacity);
    }


    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Місткість вантажу: " + cargoCapacity);
    }


    @Override
    public void move(){
        System.out.println("Вантажівка перевозить вантаж....");
    }
}


class Bike extends Transport {
    public int engineVolume;

    public Bike(String brand, String model, int year, int engineVolume) {
        super(brand, model, year);
        this.engineVolume = engineVolume;
    }

    public void getEngineVolume(){
        System.out.println("Об'єм двигуна: " + engineVolume);
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Об'єм двигуна: " + engineVolume);
    }


    @Override
    public void move(){
        System.out.println("Мотоцикл мчить трасою....");
    }
}



class Bus extends Transport {
    public int passengerCapacity;

    public Bus(String brand, String model, int year, int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
    }

    public void getPassengerCapacity(){
        System.out.println("Вмістимість пасажирів: " + passengerCapacity);
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Вмістимість пасажирів: " + passengerCapacity);
    }


    @Override
    public void move(){
        System.out.println("Автобус везе пасажирів....");
    }
}


class Scooter extends Transport {
    public double speed;

    public Scooter(String brand, String model, int year, double speed) {
        super(brand, model, year);
        this.speed = speed;
    }

    public void getSpeed(){
        System.out.println("Швидкість: " + speed);
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Швидкість: " + speed);
    }


    @Override
    public void move(){
        System.out.println("Скутер їде....");
    }
}