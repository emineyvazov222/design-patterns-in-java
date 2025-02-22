package az.spring.travel.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder("Tesla", "Model S")
                .setYear(2023)
                .setColor("White")
                .setElectric(true)
                .build();

        System.out.println(car);
    }
}
