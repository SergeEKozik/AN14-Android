package kvizhunou.Lab5;

public class Management {
    public int power = 220;
    private String model;
    private String producer;

    public Management(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public void DisplayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Producer:" + producer);
    }
}
