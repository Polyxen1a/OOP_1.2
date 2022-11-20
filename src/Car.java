public class Car {
    public String stamp;
    public String model;
    public double enginCapacity;
    public String bodyColor;
    public int yearOfProduction;
    public String countryOfAssembly;

    public Car(String stamp, String model, double enginCapacity, String bodyColor, int yearOfProduction, String countryOfAssembly) {
        if (stamp == null) {
            this.stamp = "default";
        } else {
            this.stamp = stamp;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(enginCapacity, 0) == 0) {
            this.enginCapacity = 1.5;
        } else {
            this.enginCapacity = enginCapacity;
        }
        if (bodyColor == null) {
            this.bodyColor = "белый";
        } else {
            this.bodyColor = bodyColor;
        }
        if (yearOfProduction == 0) {
            this.yearOfProduction = 2000;
        } else {
            this.yearOfProduction = yearOfProduction;
        }
        this.countryOfAssembly = countryOfAssembly;
    }
}
