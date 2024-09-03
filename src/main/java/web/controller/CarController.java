package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.entity.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam("count") int count,  Model model) {
        Car car1 = new Car("Mercedes", "E", 250);
        Car car2 = new Car("Lada", "KALINA", 1);
        Car car3 = new Car("Moskvich", "Turbp", 10);
        Car car4 = new Car("BMW", "xDrive", 330);
        Car car5 = new Car("Volga", "Vedro", 2);
        List<Car> carList= new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
       List<Car> newCars = carService.getAllCars(carList, count);

        model.addAttribute("cars", newCars);
        return "cars";
    }

}