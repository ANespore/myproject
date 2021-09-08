package cars;

import java.util.ArrayList;

public class ShowRoom {
    private ArrayList<Car> cars = new ArrayList<Car>();
    //addCar

    public String addCar(Car car){

        this.cars.add(car);
        return car.name + " Added successfully";

    }

    //getAllCars

    public ArrayList<Car> getAllCars() {
        return cars;
    }


    //getSingleCar

    public Car getSingleCar (int carId){
        return this.cars.get(carId);
    }

    //removeCar

    public String removeCar (int carId){
        try {

            cars.remove(carId);


        }catch (Exception ex){
            return  "  Unable to remove specified car "  ;
        }
        return   "car removed successfully " ;

    }
}
