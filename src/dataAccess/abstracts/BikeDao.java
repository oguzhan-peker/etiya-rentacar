package dataAccess.abstracts;

import entities.Bike;
import entities.Car;

import java.util.List;

public interface BikeDao {
    List<Bike> getAll();
    void create(Bike bike);
    Bike update(Bike bike, String name);
    void delete(int id);
    Bike getById(int id);
}
