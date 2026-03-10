class Transport {
    public String brand;
    public String model;
    public Integer year;

    public void getInfo(){
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Рік: " + year);
    }


    public void move(){
        System.out.println("Транспорт рухається....");
    }
}


class Car extends Transport {
    public Integer passengerCount;

    public void getPassengerCount(){
        System.out.println("Кількість можливих пасажирів: " + passengerCount);
    }


    @Override
    public void getInfo(){
        super.getInfo(); // виводить базові поля з Transport
        System.out.println("Кількість можливих пасажирів: " + passengerCount);
    }

    @Override
    public void move(){
        System.out.println("Автомобіль їде по дорозі....");
    }
}


class Truck extends Transport {
    public Integer cargoCapacity;

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
    public Integer engineVolume;

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
