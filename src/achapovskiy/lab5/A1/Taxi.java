package achapovskiy.lab5.A1;

public class Taxi extends Transport {

     private boolean onLine;

     public Taxi(int  fuel, byte [] coordinate){     //конструктор
           super(fuel,coordinate);
     }

     public Taxi(int  fuel, byte [] coordinate,boolean onLine){
          super(fuel,coordinate);
          this.onLine = onLine;
     }


     public  void setValues (double fuel, int speed, String color,byte [] coordinate, boolean onLine){
          super.setValues(fuel, speed,color,coordinate);
          this.onLine = onLine;
     }

     @Override
     protected String getValues() {
          System.out.println(super.getValues());
          return  getLoaded();
     }

     public  void setOnLine(boolean onLine){
          this.onLine = onLine;
     }

     public String getLoaded() {
          if(onLine == true){
               return "Такси находится на линии";
          }
          else {
               return"Такси находится в автопарке";
          }
     }
}
