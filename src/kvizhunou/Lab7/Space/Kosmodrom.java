package kvizhunou.Lab7.Space;

public class Kosmodrom {
    public void launch(IStart iStart) {
        if (iStart.preStart()) {
            iStart.engStart();
            for (int x = 10; x >= 0; x--)
                System.out.println(x);
            iStart.start();
        } else System.out.println(" PRESTART EROR");
    }
}
