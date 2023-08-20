import java.util.Objects;

public class CarData extends Car{
    private int yearOfRelease;
    private String model;
    private int price;
    private String color;

    public CarData( int yearOfRelease, String model, int price, String color) {
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CarData carData = (CarData) o;
        return yearOfRelease == carData.yearOfRelease && price == carData.price && Objects.equals(model, carData.model) && Objects.equals(color, carData.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), yearOfRelease, model, price, color);
    }

    @Override
    public String toString() {
        return "CarData{" +
                "yearOfRelease=" + yearOfRelease +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
