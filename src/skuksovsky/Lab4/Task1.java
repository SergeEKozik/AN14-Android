package skuksovsky.Lab4;
import java.util.*;
public class Task1 { // Если нужно хранить все введенные строки
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Введите строки (end для завершения ввода): ");
        while (sc.hasNextLine()) {
            String inputString = sc.nextLine();
            if (!inputString.equals("end")) {
                stringBuilder.append(inputString).append("SPLIT_HERE");
            } else {
                sc.close();
                break;
            }
        }

        String[] totalStringsArray = stringBuilder.toString().split("SPLIT_HERE");
        int[] totalStringsLength = new int[totalStringsArray.length];
        for (int i = 0; i < totalStringsArray.length; i++) {
            totalStringsLength[i] = totalStringsArray[i].length();
        }
        int minLengthValue = Arrays.stream(totalStringsLength).min().getAsInt();
        int maxLengthValue = Arrays.stream(totalStringsLength).max().getAsInt();
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < totalStringsLength.length; i++) {
            if (totalStringsLength[i] == minLengthValue) {
                minIndex = i;
            } else if (totalStringsLength[i] == maxLengthValue) {
                maxIndex = i;
            }
        }

        System.out.println("Самая короткая строка имеет длину " + minLengthValue + " и выглядит так: " + totalStringsArray[minIndex]);
        System.out.println("Самая длинная строка имеет длину " + maxLengthValue + " и выглядит так: " + totalStringsArray[maxIndex]);

    }
}
