package vadim.sazonenko.Lab5.Task2;

public class Crane {
    private String name;
    private String type;
    private int height;
    private int load;

    String getName() {
        return name;
    }

    void setName(String name) {
        name = name;
    }

    String getType () {
        return  type;
    }

    void setType (String type) {
        type = type;
    }

    int getHeight() {
        return height;
    }

    void setHeight(int height) {
        height = height;
    }

    int getLoad() {
        return load;
    }

    void setLoad(int load) {
        load = load;
    }


    Crane(String cranetype,String cranename, int craneheight, int craneload) {
        type = cranetype;
        name = cranename;
        height = craneheight;
        load = craneload;
    }

    void Info() {
        System.out.println("Тип: " + type);
        System.out.println("Название: " + name);
        System.out.println("Высота: " + height + " метров");
        System.out.println("Грузоподъёмность: " + load + " тонн");
    }

}
