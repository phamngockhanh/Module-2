package ss0_homework.manage_vehicle.repository;

import ss0_homework.manage_vehicle.common.DeleteFlag;
import ss0_homework.manage_vehicle.entity.Car;

import java.util.ArrayList;

public class CarRepository implements ICarRepository {
    private static ArrayList<Car> cars = new ArrayList<>();
    static {
        Car c1 = new Car("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", 5, "Du lịch");
        Car c2 = new Car("43B-453.88", "Huyndai", 2020, "Nguyễn Văn B", 45, "Xe  khách");
        Car c3 = new Car("43B-453.89", "Ford", 2020, "Nguyễn Văn C", 16, "Xe  khách");
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
    }

    @Override
    public ArrayList<Car> findAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void findNumberPlate(String numberPlate) {
        for (Car car : cars) {
            if (numberPlate.equals(car.getNumberPlate())) {
                DeleteFlag.flag = true;
                break;
            }
        }
    }

    @Override
    public void delete(String numberPlate) {
        for(int i =0;i< cars.size();i++){
            if (numberPlate.equals(cars.get(i).getNumberPlate())){
                    cars.remove(i);
                    break;
            }
        }
    }

    @Override
    public void delete1(Car car) {
        cars.remove(car);
    }




}





