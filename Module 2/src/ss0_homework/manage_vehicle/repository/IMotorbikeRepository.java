package ss0_homework.manage_vehicle.repository;

import ss0_homework.manage_vehicle.entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeRepository {
    ArrayList<Motorbike> findAll();
    void add(Motorbike motorbike);
    void findNumberPlate(String numberPlate);
    void delete(String numberPlate);
}
