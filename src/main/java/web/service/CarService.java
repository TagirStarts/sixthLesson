package web.service;
import java.util.Arrays;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarService {
    private List<Car> cars = Arrays.asList(
            new Car ("Kalina",2014,"black"),
            new Car ("Devyatka",2008,"black"),
            new Car ("Chetyrka",2012,"gold"),
            new Car ("Dvenashka",2010,"red"),
            new Car ("Bogdan",2011,"white"));
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}
