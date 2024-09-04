package web.service;

import web.entity.Car;

import java.util.List;

public interface CarService
{

    public List<Car> getAllCars(List<Car> list, int count);

    public Car newCar(String brand, String model, int number);
}
