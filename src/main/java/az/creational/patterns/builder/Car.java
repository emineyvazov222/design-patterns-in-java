package az.creational.patterns.builder;

public class Car {

    private String brand;
    private String model;
    private int year;
    private String color;
    private boolean isElectric;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.isElectric = builder.isElectric;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }


    public static class CarBuilder {
        private String brand;
        private String model;
        private int year;
        private String color;
        private boolean isElectric;

        public CarBuilder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setElectric(boolean isElectric) {
            this.isElectric = isElectric;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}
