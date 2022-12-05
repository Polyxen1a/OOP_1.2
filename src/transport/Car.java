package transport;

public class Car {
    private final String stamp;
    private final String model;
    private double enginCapacity;
    private String bodyColor;
    private final int yearOfProduction;
    private final String countryOfAssembly;

    public String transmission;
    private final String bodyType;
    public String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;


    public Car(String stamp,
               String model,
               double enginCapacity,
               String bodyColor,
               int yearOfProduction,
               String countryOfAssembly,
               String bodyType,
               int numberOfSeats) {
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

        this.transmission = "МКПП";
        this.bodyType = "седан";
        this.numberOfSeats = 5;
        this.registrationNumber = "х000хх000";
        this.summerTires = true;
    }



    public double getEnginCapacity() {
        return enginCapacity;
    }

    public void setEnginCapacity(double enginCapacity) {
        this.enginCapacity = enginCapacity;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
        this.transmission = transmission;

    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber){
            if (transmission == null) {
                this.registrationNumber = "х000хх000";
            } else {
                this.registrationNumber = registrationNumber;
            }

            public boolean isSummerTires () {
                return summerTires;
            }

            public void setSummerTires ( boolean summerTires){
                this.summerTires = summerTires;
            }

            public String getStamp () {
                return stamp;
            }

            public String getModel () {
                return model;
            }

            public int getYearOfProduction () {
                return yearOfProduction;
            }

            public String getCountryOfAssembly () {
                return countryOfAssembly;
            }

            public String getBodyType () {
                return bodyType;
            }

            public int getNumberOfSeats () {
                return getNumberOfSeats;
            }
            public void changeTires() {
                summerTires = !summerTires;
            }
            public boolean isCorrectRegNumber() {
                if (registrationNumber.length() != 9) {
                    return registrationNumber.length;
                }
                char[] chars = registrationNumber.toCharArray();
                if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
                    return false;
                }
                return Character.isDigit(chars[1] && Character.isDigit(chars[2] && Character.isDigit(chars[3] &&
                        Character.isDigit(chars[6] && Character.isDigit(chars[7] && Character.isDigit(chars[8]);
                }

            }
    }
}




