import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car grande = new Car("Lada",
                "Grande",
                1.7,
                "Жёлтый",
                2015,
                "Россия");



        System.out.println("Марка автомобиля " + grande.stamp +
                ", модель " + grande.model +
                ", год выпуска " + grande.yearOfProduction +
                ", страна-производитель " + grande.countryOfAssembly +
                ", цвет кузова " + grande.bodyColor +
                ", объём двигателя " + grande.enginCapacity);

        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия");
        audi.setTransmission("автомат");

        System.out.println("Марка автомобиля " + audi.stamp +
                ", модель " + audi.model +
                ", год выпуска " + audi.yearOfProduction +
                ", страна-производитель " + audi.countryOfAssembly +
                ", цвет кузова " + audi.bodyColor +
                ", объём двигателя " + audi.enginCapacity);

        Car bmw = new Car("BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия");




        private static void printInfo (Car car);
        System.out.println(
                car.stamp() + " " + car.model() +
                        ", год выпуска: " + car.yearOfProduction +
                        ", страна-производитель " + car.countryOfAssembly +
                        ", цвет кузова " + car.bodyColor +
                        ", объём двигателя " + car.enginCapacity);
        );


    }
}