package academy.devdojo.maratonajava.javacore.zzb_comportamento.teste;

import academy.devdojo.maratonajava.javacore.zzb_comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametrotest01 {

   private  static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));

   //-----------------------------------------------------------------------------------

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("-------------------");
        System.out.println(filterByYearBefore(cars, 2015));
    }
    //-----------------------------------------------------------------------------------

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("green")){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
    //-----------------------------------------------------------------------------------
    private static List<Car> filterRedCar(List<Car> cars){
        List<Car> FilteredCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals("red")){
                FilteredCars.add(car);
            }
        }
        return FilteredCars;
    }
    //-----------------------------------------------------------------------------------

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(color)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
    //-----------------------------------------------------------------------------------

    private static List<Car> filterByYearBefore(List<Car> cars, int year){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() < year){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}
