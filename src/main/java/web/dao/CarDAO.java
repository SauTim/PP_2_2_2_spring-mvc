package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "Green", 2000));
        cars.add(new Car("BMW", "White", 2005));
        cars.add(new Car("Porsche", "Blue", 2010));
        cars.add(new Car("Audi", "Yellow", 2015));
        cars.add(new Car("Volvo", "Red", 2020));
    }

    public List<Car> printAmount(int amount) {
        if (amount >= cars.size()) {
            return cars;
        }
        return cars.subList(0, amount);
    }
}
