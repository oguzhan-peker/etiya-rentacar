package consoleUi;

import dataAccess.abstracts.BikeDao;
import dataAccess.abstracts.CarDao;
import dataAccess.abstracts.TruckDao;
import dataAccess.concretes.InMemoryBikeDao;
import dataAccess.concretes.InMemoryCarDao;
import dataAccess.concretes.InMemoryTruckDao;
import entities.Bike;
import entities.Car;
import entities.Truck;
import service.abstracts.BikeService;
import service.abstracts.CarService;
import service.abstracts.TruckService;
import service.concretes.BikeManager;
import service.concretes.CarManager;
import service.concretes.TruckManager;

public class Main {
    public static void main(String[] args) {

        Car car1= new Car(1,"bmw");
        Car car2=new Car(2,"mercedes");
        Bike car3=new Bike(3,"yamaha","mt07");
        Truck car4=new Truck(4,"temsa","çimento");

        CarDao inMemoryCarDao = new InMemoryCarDao();
        BikeDao inMemoryBikeDao = new InMemoryBikeDao();
        TruckDao inMemoryTruckDao = new InMemoryTruckDao();

        CarService carService=new CarManager(inMemoryCarDao);
        BikeService bikeService=new BikeManager(inMemoryBikeDao);
        TruckService truckService=new TruckManager(inMemoryTruckDao);
        carService.add(car1);
        carService.add(car2);
        bikeService.add(car3);
        truckService.add(car4);

        for (Car car:carService.getAll()){
            System.out.println(car.getId() + "-" + car.getName());

        }
        for (Bike bike:bikeService.getAll()){
            System.out.println(bike.getId() + "-" + bike.getName() + " " + bike.getModel());

        }
        for (Truck truck:truckService.getAll()){
            System.out.println(truck.getId() + "-" + truck.getName()+ " " + truck.getLoad() + " " + "taşıyor");

        }
}
}