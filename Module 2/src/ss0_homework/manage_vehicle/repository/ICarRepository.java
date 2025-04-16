package ss0_homework.manage_vehicle.repository;

import ss0_homework.manage_vehicle.entity.Car;

import java.util.ArrayList;

public interface ICarRepository {
    ArrayList<Car> findAll();
    void add(Car car);
    void findNumberPlate(String numberPlate);
    void delete(String numberPlate);
    //void update(int id, ArrayList<Car> cars);
}
