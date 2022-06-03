package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        model.addAttribute("cars", carService.cars(count.orElse(0)));
        return "cars";
    }
    //orElse проверяет значения,если ничего нет,вернет 0, говорят, что это самая плохая непредсказуемая
    // штука из Optional, правда ли?
}
