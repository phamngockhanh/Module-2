package ss0_homework.manage_vehicle.repository;

import ss0_homework.manage_vehicle.entity.Car;
import ss0_homework.manage_vehicle.entity.Motorbike;
import ss0_homework.manage_vehicle.entity.Truck;
import ss0_homework.manage_vehicle.entity.Vehicle;

import java.util.ArrayList;

public class VehicleRepository implements IVehicleRepository{
    ArrayList<Vehicle> vehicleList = new ArrayList<>();
    ICarRepository icarRepository = new CarRepository();
    IMotorbikeRepository iMotorbikeRepository = new MotorbikeRepository();
    ITruckRepository iTruckRepository = new TruckRepository();
    @Override
    public Vehicle checkNumberPlate(String numberPlate) {
        ArrayList<Car> carList = icarRepository.findAll();
        ArrayList<Motorbike> motorbikeList = iMotorbikeRepository.findAll();
        ArrayList<Truck> truckList = iTruckRepository.findAll();
        vehicleList.addAll(carList);
        vehicleList.addAll(motorbikeList);
        vehicleList.addAll(truckList);
        for(Vehicle vehicle:vehicleList){
            if(numberPlate.equalsIgnoreCase(vehicle.getNumberPlate())){
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public void delete(Vehicle vehicle) {
        if(vehicle instanceof Car){
            icarRepository.delete1((Car) vehicle);
        }else if(vehicle instanceof Motorbike){
            iMotorbikeRepository.delete1((Motorbike) vehicle);
        }else{
            iTruckRepository.delete1((Truck) vehicle);
        }
    }
}
