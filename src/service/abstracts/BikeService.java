package service.abstracts;

import entities.Bike;
import entities.Car;

import java.util.List;

public interface BikeService {

    void add(Bike bike);
    List<Bike> getAll();
    Bike getById(int id);
}
