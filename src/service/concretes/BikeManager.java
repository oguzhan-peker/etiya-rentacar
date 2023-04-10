package service.concretes;

import dataAccess.abstracts.BikeDao;

import entities.Bike;

import service.abstracts.BikeService;

import java.util.List;

public class BikeManager implements BikeService {

    private final BikeDao bikeDao;

    public BikeManager(BikeDao bikeDao) {
        this.bikeDao = bikeDao;
    }

    @Override
    public void add(Bike bike) {
        if (bike.getName() == null) {
            System.out.println("İsim giriniz.");
            return;
        }
        bikeDao.create(bike);
    }

    @Override
    public List<Bike> getAll () {
        return bikeDao.getAll();
    }

    @Override
    public Bike getById ( int id){
        return bikeDao.getById(id);

    }
}
