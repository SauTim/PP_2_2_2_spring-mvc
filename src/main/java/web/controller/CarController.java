package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
public class CarController {
    private CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam("printAmount")String name, Model model) {
        model.addAttribute("cars", carDAO.printAmount(Integer.parseInt(name)));
        return "cars";
    }

    @RequestMapping("/askDetails")
    public String askCarDetails() {
        return "cars-info";
    }
}
