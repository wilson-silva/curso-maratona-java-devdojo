package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.singleton.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLaze {
    //Eager initialization
    private static AircraftSingletonLaze INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLaze(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonLaze getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLaze.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLaze("787-900");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
