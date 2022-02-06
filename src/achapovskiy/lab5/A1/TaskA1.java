package achapovskiy.lab5.A1;

public class TaskA1 {
    public static void main(String[] args) {
        Bus bus = new Bus(250,60,"Yellow", new byte[] {0,0}  );

        Taxi taxi = new Taxi(200,new byte[] {100,100} );
        taxi.setValues(250,60,"Yellow", new byte[] {0,0}, true);
        System.out.println(taxi.getValues());



    }
}