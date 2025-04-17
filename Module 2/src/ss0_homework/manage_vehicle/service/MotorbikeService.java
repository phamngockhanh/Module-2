package ss0_homework.manage_vehicle.service;


import ss0_homework.manage_vehicle.entity.Motorbike;
import ss0_homework.manage_vehicle.repository.IMotorbikeRepository;
import ss0_homework.manage_vehicle.repository.MotorbikeRepository;

import java.util.ArrayList;

public class MotorbikeService implements IMotorbikeService {
    private IMotorbikeRepository iMotorbikeRepository = new MotorbikeRepository();


    @Override
    public ArrayList<Motorbike> findAll() {
        return iMotorbikeRepository.findAll();
    }

    @Override
    public void add(Motorbike motorbike) {
        iMotorbikeRepository.add(motorbike);
    }
    @Override
    public void findNumberPlate(String numberPlate) {
        iMotorbikeRepository.findNumberPlate(numberPlate);
    }

    @Override
    public void delete(String numberPlate) {
        iMotorbikeRepository.delete(numberPlate);
    }

}
