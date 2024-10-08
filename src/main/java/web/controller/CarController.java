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
    public String printWelcome(@RequestParam("count") int count, Model model) {

        List<Car> newCars = carService.getAllCars(carService.createCarList(), count);
        model.addAttribute("cars", newCars);
        return "cars";
    }

}