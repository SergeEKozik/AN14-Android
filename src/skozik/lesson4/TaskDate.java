package skozik.lesson4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет, сколько дней осталось до Нового года.
 * При вводе неверных данных должно быть выведено сообщение об ошибке. Считается, что год невисокосный.
 * Входные данные
 * Входная строка содержит два целых числа: номер месяца и номер дня в этом месяце.
 * <p>
 * Выходные данные
 * Программа должна вывести количество дней, оставшихся до Нового года.
 * Если введены неверные данные, нужно вывести число -1.
 */
public class TaskDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца и день.");
        int monthNum = scanner.nextInt();
        int dayNum = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();
        LocalDate localDate = null;
        try {
            localDate = LocalDate.of(currentYear, monthNum, dayNum);
        } catch (Exception e) {
            System.out.printf("-1%nНеправильный формат ввода %s%n", e.getMessage());
            return;
        }
        LocalDate newYear = LocalDate.of(currentYear + 1, 1, 1);
        System.out.printf("Количество дней до нового года: %d%n",
            Duration.between(localDate.atStartOfDay(), newYear.atStartOfDay()).toDays());
    }
}