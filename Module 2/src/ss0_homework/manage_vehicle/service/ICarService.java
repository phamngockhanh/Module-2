package ss0_homework.manage_vehicle.service;

import ss0_homework.manage_vehicle.entity.Car;

import java.util.ArrayList;

public interface ICarService {
    ArrayList<Car> findAll();
    void add(Car car);
    void findNumberPlate(String numberPlate);
    void delete(String numberPlate);
}
