package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    public static List<Car> carList;

    public CarServiceImpl(List<Car> carList) {
        this.carList = carList;
        carList.add(new Car("Audi", "V6", 10000));
        carList.add(new Car("BMW", "V6", 15000));
        carList.add(new Car("Honda", "V4", 12000));
        carList.add(new Car("Toyota", "V8", 20000));
        carList.add(new Car("Lada", "V4", 5000));
    }

    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
