package review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota",140,1998));
        carList.add(new Car("Audi",200,2008));
        carList.add(new Car("BMW",210,2020));
        carList.add(new Car("Nissan",150,2018));

        //list of fast cars
        CarFastPredicate fastPredicate = new CarFastPredicate();
        List<Car> fastCarListt = filterCars(carList, fastPredicate);

        List<Car> newCarList = filterCars(carList, new CarNewPredicate());
        System.out.println(newCarList);

        //double car, --make toyota
        List<Car> durableCarList = filterCars(carList, new CarDurablePredicate());
        System.out.println(durableCarList);
        //new car with lambda
        CarPredicate newCArLambda = (Car car) -> car.getYear()>2015;
        List<Car> newCarListLambda = filterCars(carList, newCArLambda);
        System.out.println(newCarListLambda);
        //fast car wih lambda
        //if you have only one variable, you can remove variable type and ()
        List<Car> fastCarListLambda = filterCars(carList, car-> car.getTopSpeed()>160);
        System.out.println(fastCarListLambda);







    }

    private static List<Car> filterCars(List<Car> carList, CarPredicate carPredicate) {

        List<Car> result = new ArrayList<>();
        for(Car car : carList){
            if(carPredicate.test(car)){
                result.add(car);
            }
        }
        return result;
    }
}
