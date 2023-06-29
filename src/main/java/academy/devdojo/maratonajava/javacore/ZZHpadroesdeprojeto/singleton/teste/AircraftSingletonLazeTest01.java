package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.singleton.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.singleton.dominio.AircraftSingletonLaze;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazeTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");

        System.out.println(AircraftSingletonLaze.getINSTANCE());
        System.out.println(AircraftSingletonLaze.getINSTANCE());

        //Na vida real não usar isso
        var constructor = AircraftSingletonLaze.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonLaze aircraftSingletonLaze = constructor.newInstance("787-900");
        System.out.println(aircraftSingletonLaze);
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonLaze.getINSTANCE());
        AircraftSingletonLaze aircraftSingletonLaze = AircraftSingletonLaze.getINSTANCE();
        System.out.println(aircraftSingletonLaze.bookSeat(seat));
    }
}
