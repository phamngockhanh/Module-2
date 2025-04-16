package ss0_homework.manage_vehicle.service;

import ss0_homework.manage_vehicle.entity.Car;
import ss0_homework.manage_vehicle.repository.CarRepository;
import ss0_homework.manage_vehicle.repository.ICarRepository;

import java.util.ArrayList;

public class CarService implements ICarService {
    private ICarRepository icarRepository = new CarRepository();
    @Override
    public ArrayList<Car> findAll() {
        return icarRepository.findAll();
    }

    @Override
    public void add(Car car) {
        icarRepository.add(car);
    }

    @Override
    public void findNumberPlate(String numberPlate) {
        icarRepository.findNumberPlate(numberPlate);
    }

    @Override
    public void delete(String numberPlate) {
        icarRepository.delete(numberPlate);
    }


}
