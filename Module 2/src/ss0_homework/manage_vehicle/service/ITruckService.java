package ss0_homework.manage_vehicle.service;

import ss0_homework.manage_vehicle.entity.Truck;

import java.util.ArrayList;

public interface ITruckService{
    ArrayList<Truck> findAll();
    void add(Truck truck);
    void findNumberPlate(String numberPlate);
    void delete(String numberPlate);
}
