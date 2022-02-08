package VNazarov.Lab05.TaskA2;

public class WorkCheck {
    public static void main(String[] args) {

        ATM first = new ATM("Alfa Bank");
        ATM second = new ATM("belarusbank");

        PayCard sec = new PayCard("4123 1233 1233 1233", "04 22", "111", "Belarus bank");
        System.out.println();

        second.refill(sec);
        second.checkBalance(sec);
        System.out.println();

        first.checkBalance(sec);
        System.out.println();

        second.checkBalance(sec);
        System.out.println();
    }
}
