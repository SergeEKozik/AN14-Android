package ssazonenko.lab5.TaskTwo.Type;

public class Autocrane {
    private int loadcapacity ;
    private String name;
    private int lengtharrow;

    public int getLoadcapacity() {
        return loadcapacity;
    }

    public void setLoadcapacity(int loadcapacity) {
        this.loadcapacity = loadcapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLengtharrow(int lengtharrow) {
        this.lengtharrow = lengtharrow;
    }

    public String getName() {
        return name;
    }

    public int getLengtharrow() {
        return lengtharrow;
    }

   public void catalog () {}
    public void model() {}

    public void Info (String name , int loadcapacity, int lengtharrow ) {
            System.out.println("Модель: " + name);
            System.out.println("Грузоподъеность: " + loadcapacity + "т");
            System.out.println("Длинна стрелы: " + lengtharrow + "м");
        }

  public   void choose () {
        System.out.println("Выберите тип крана:" + '\n' +
                "1.Легкий класс" + '\n' +
                "2.Средний класс" + '\n' +
                "3.Тяжелый класс" + '\n' +
                "4.Сверхтяжелый класс");
    }
}
