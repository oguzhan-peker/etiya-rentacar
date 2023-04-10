package entities;

public class Bike extends Car{
    private String model;

    public Bike(int id, String name, String model) {
        super(id, name);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
