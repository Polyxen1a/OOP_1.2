public class Main {
    public static void main(String[] args) {
        Car grande = new Car("Lada",
                "Grande",
                1.7,
                "Жёлтый",
                2015,
                "Россия");
        grande.stamp = "Lada";
        grande.model = "Grande";
        grande.yearOfProduction = 2015;
        grande.countryOfAssembly = "Россия";
        grande.bodyColor = "Жёлтый";
        grande.enginCapacity = 1.7;

        System.out.println("Марка автомобиля " + grande.stamp +
                ", модель " + grande.model +
                ", год выпуска " + grande.yearOfProduction +
                ", страна-производитель " + grande.countryOfAssembly +
                ", цвет кузова " +  grande.bodyColor +
                ", объём двигателя " + grande.enginCapacity);

        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия");
        audi.stamp = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.yearOfProduction = 2020;
        audi.countryOfAssembly = "Германия";
        audi.bodyColor = "черный";
        audi.enginCapacity = 3.0;

        System.out.println("Марка автомобиля " + audi.stamp +
                ", модель " + audi.model +
                ", год выпуска " + audi.yearOfProduction +
                ", страна-производитель " + audi.countryOfAssembly +
                ", цвет кузова " +  audi.bodyColor +
                ", объём двигателя " + audi.enginCapacity);

        Car bmw = new Car("BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия");
        bmw.stamp = "BMW";
        bmw.model = "Z8";
        bmw.yearOfProduction = 2021;
        bmw.countryOfAssembly = "Германия";
        bmw.bodyColor = "черный";
        bmw.enginCapacity = 3.0;

        System.out.println("Марка автомобиля " + bmw.stamp +
                ", модель " + bmw.model +
                ", год выпуска " + bmw.yearOfProduction +
                ", страна-производитель " + bmw.countryOfAssembly +
                ", цвет кузова " +  bmw.bodyColor +
                ", объём двигателя " + bmw.enginCapacity);

        Car kia = new Car("Kia",
                "Sportage 4 поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея");
        kia.stamp = "Kia";
        kia.model = "Sportage 4 поколения";
        kia.yearOfProduction = 2018;
        kia.countryOfAssembly = "Южная Корея";
        kia.bodyColor = "красный";
        kia.enginCapacity = 2.4;

        System.out.println("Марка автомобиля " + kia.stamp +
                ", модель " + kia.model +
                ", год выпуска " + kia.yearOfProduction +
                ", страна-производитель " + kia.countryOfAssembly +
                ", цвет кузова " +  kia.bodyColor +
                ", объём двигателя " + kia.enginCapacity);

        Car hyunday = new Car("Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея");
        hyunday.stamp = "Hyundai";
        hyunday.model = "Avante";
        hyunday.yearOfProduction = 2016;
        hyunday.countryOfAssembly = "Южная Корея";
        hyunday.bodyColor = "оранжевый";
        hyunday.enginCapacity = 1.6;

        System.out.println("Марка автомобиля " + hyunday.stamp +
                ", модель " + hyunday.model +
                ", год выпуска " + hyunday.yearOfProduction +
                ", страна-производитель " + hyunday.countryOfAssembly +
                ", цвет кузова " +  hyunday.bodyColor +
                ", объём двигателя " + hyunday.enginCapacity);


    }
}