package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    List<Car> cars = new ArrayList<>();{
        cars.add(new Car("prise","Audi",100,"Vampir"));
        cars.add(new Car("red","Ford",1,"Toppp"));
        cars.add(new Car("black","Volvo",10,"Nadezhno"));
        cars.add(new Car("grey","Audi",100,"Sho to,sho eto"));
        cars.add(new Car("black","Opel",666,"Astra,one love"));
    }
    @Override
    public List<Car> cars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
        //лимит должен ограничивать список возвращаемых машин по счетчику
    }
}
