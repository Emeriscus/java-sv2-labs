package lambdaintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsedCars {

    private List<Car> usedCars = new ArrayList<>();

    public UsedCars(List<Car> usedCars) {
        this.usedCars = usedCars;
    }

    public List<Car> getUsedCars() {
        return usedCars;
    }

    public List<Car> listCarsOneBrandByType(String brand) {

        List<Car> result = new ArrayList<>();
        for (Car actual : usedCars) {
            if (actual.getBrand().equals(brand)) {
                result.add(actual);
            }
        }
//        result.sort((car, anotherCar) -> car.getType().compareTo(anotherCar.getType()));
        result.sort(Comparator.comparing(Car::getType));
        return result;

//        return usedCars.stream()
//                .filter(car -> car.getBrand().equals(brand))
//                .sorted(Comparator.comparing(Car::getType))
//                .toList();
    }

    public List<Car> listCarsByLengthDesc() {

        List<Car> result = new ArrayList<>(usedCars);
        result.sort(Comparator.comparing(Car::getLength).reversed());   //vagy:
//        result.sort((car, anotherCar) -> Double.valueOf(car.getLength()).compareTo(anotherCar.getLength()));
//        Collections.reverse(result);
        return result;

//        return usedCars.stream()
//                .sorted(Comparator.comparing(Car::getLength).reversed())
//                .toList();
    }

    public List<Car> listCarsByPrice() {

        List<Car> result = new ArrayList<>(usedCars);
//        result.sort(Comparator.comparing(Car::getPrice));   // vagy:
        result.sort((car, anotherCar) -> Integer.valueOf(car.getPrice()).compareTo(anotherCar.getPrice()));
//        result.sort((car, anotherCar) -> car.getPrice()-anotherCar.getPrice());
        return result;

//        return usedCars.stream()
//                .sorted(Comparator.comparing(Car::getPrice))
//                .toList();
    }
}
