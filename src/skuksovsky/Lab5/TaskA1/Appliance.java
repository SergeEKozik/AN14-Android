package skuksovsky.Lab5.TaskA1;

abstract class Appliance {
    String type;
    String energySource;
    String location;
    String producer;
    String operatesWith;
    private boolean pluggedIn;
    private boolean works;

    void plugIn() {
        pluggedIn = true;
        System.out.println("Plugged In");
    }

    void plugOut() {
        pluggedIn = false;
        System.out.println("Plugged Out");
    }

    void start() {
        if(pluggedIn) {
            works = true;
            System.out.println("Activated");
        } else {
            System.out.println("Plug it in first");
        }
    }

    void stop() {
        if (!pluggedIn) {
            works = false;
            System.out.println("Deactivated");
        } else {
            System.out.println("Plug it out first");
        }
    }

    void mainData() {
        System.out.println(type + " works from " + energySource + ", stays at " + location + ", made by " + producer + " and operates with " + operatesWith + "\n");
        System.out.println(works ? "Working" + "\n": "Sleeping" + "\n");
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public Appliance(String producer) {
        this.producer = producer;
    }
}
