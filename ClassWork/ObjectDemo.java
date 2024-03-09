public class ObjectDemo {
    private String make;
    private String color;
    private String type;
    private double price;

    public void setMake(String carMake) {
        make = carMake;
    }

    public String getMake() {
        return make;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public ObjectDemo(String make, String color, String type, double price) {
        this.make = make;
        this.color = color;
        this.type = type;
        this.price = price;
    }
}

ObjectDemo car1 = new ObjectDemo();
