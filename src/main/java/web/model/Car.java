package web.model;

public class Car {

    private String name;

    private String engine;

    private int price;

    public Car(String name, String engine, int price) {
        this.name = name;
        this.engine = engine;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
