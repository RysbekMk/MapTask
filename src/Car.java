import java.util.Objects;

public class Car {
    private int id;
    private int numberCar;

    public Car(int id, int numberCar) {
        this.id = id;
        this.numberCar = numberCar;
    }
    public Car(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && numberCar == car.numberCar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberCar);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberCar=" + numberCar +
                '}';
    }
}
