package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getAllCars(List<Car> list, int count) {
        int endIndex = Math.min(count, list.size());
        return new ArrayList<>(list.subList(0, endIndex));
    }

    @Override
    public Car newCar(String brand, String model, int number) {
        return new Car(brand, model, number);
    }
}
