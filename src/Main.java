import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, CarData> carBasa = new HashMap<>();
        carBasa.put(new Car(1, 501), new CarData(2018, "Kia", 1000000, "white"));
        carBasa.put(new Car(2, 194), new CarData(2003, "Mersedes", 800000, "dark blue"));
        carBasa.put(new Car(3, 747), new CarData(2001, "ford", 200000, "grey"));
        carBasa.put(new Car(4, 298), new CarData(204, "Hyndai", 700000, "blue"));
        carBasa.put(new Car(5, 112), new CarData(2018, "Tayota", 750000, "white"));
        for (Map.Entry<Car, CarData> carCarDataEntry : carBasa.entrySet()) {
            System.out.println(carCarDataEntry);

        }

    }
}