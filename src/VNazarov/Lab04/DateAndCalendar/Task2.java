package VNazarov.Lab04.DateAndCalendar;
import java.util.Date;

public class Task2 {
    public static void main(String[] args){

        Date now = new Date();
        System.out.println("It's a " + now);
        System.out.println(isDateOdd(now));
    }

    public static String isDateOdd (Date a){
        Date jan1 = new Date();
        jan1.setMonth(0);
        jan1.setDate(0);
        long difference = Math.round((a.getTime() - jan1.getTime()) / (1000 * 60 * 60 * 24)) + 1;
        System.out.println("Now is " + difference + " day from the beginning of the Year.");
        if (difference % 2 == 0) return "You can't rest at Nebula-1.";
        else return "You can rest at Nebula-1.";
    }
}
