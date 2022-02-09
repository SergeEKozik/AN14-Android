package eveshtard.Lab6.Space;

/*Создаем класс Космодром. В классе создаем метод:
• запуск start
Метод запуск принимает объект типа IStart.
В методе первым делом осуществляем предстартовую проверку (pre-start check) переданного
объекта, если она провалилась(метод вернул false) выводим сообщение
«Предстартовая проверка провалена».
Если проверка прошла успешно, то производим запуск
двигателей(вызываем метод запуска двигателя).
После этого производиться обратный отсчет (10 ..... 1).
После обратного отсчета вызываем метод старт переданного объекта.
*/
public class Spaceport {
    private IStart shuttle;

    public Spaceport(IStart shuttle) {
        this.shuttle = shuttle;
    }

    public void start() throws InterruptedException {
        if (shuttle.preStarCheck()) {
            shuttle.engineStart();
            reversCount();
            shuttle.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }

    private static void reversCount() throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            System.out.print(i);
            Thread.sleep(300);
            System.out.print(".");
            Thread.sleep(300);
            System.out.print(".");
            Thread.sleep(300);
            System.out.print(".");
            Thread.sleep(300);
        }
    }
}
