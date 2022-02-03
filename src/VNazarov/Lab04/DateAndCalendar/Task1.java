package VNazarov.Lab04.DateAndCalendar;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {

        Date day = new Date();
        System.out.println(day);
        int sDay = day.getDay();

        switch (sDay){
            case 1:
                System.out.println("It's Monday!");
                break;
            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday!");
                break;
            case 6:
                System.out.println("It's Saturday!");
                break;
            case 7:
                System.out.println("It's Sunday!");
                break;
            default:
                System.out.println("Wtf?");
                break;
        }
    }
}
