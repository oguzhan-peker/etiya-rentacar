package dataAccess.concretes;

import dataAccess.abstracts.BikeDao;
import entities.Bike;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBikeDao implements BikeDao {

    List<Bike> bikes = new ArrayList<>();

    @Override
    public List<Bike> getAll() {
        return bikes;
    }

    @Override
    public void create(Bike bike) {
        bikes.add(bike);
    }

    @Override
    public Bike update(Bike bike, String name) {
        bike.setName(name);
        return bike;
    }

    @Override
    public void delete(int id) {
        bikes.remove(id);
    }

    @Override
    public Bike getById(int id) {
        return bikes.stream()
                .filter(bike -> bike.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
