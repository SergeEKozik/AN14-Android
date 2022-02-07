package achapovskiy.lab4;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), rezSTR = "";               //NEWwen sundaySaturday golGOP oRor areARE toto - ввожу вот это
        String[] words = str.toLowerCase().split(" ");   //преобразование строки в массив СЛОВ
        for (int i = 0; i < words.length; i++)                 // проход по СЛОВАМ
        {
            String letter = "";
            for (int j = 0; j < words[i].length(); j++)         //проход по БУКВАМ в СЛОВЕ
            {
                if (letter.indexOf(words[i].charAt(j)) == -1)   //если БУКВА (подстрока) не будет найдена, то...
                {
                    letter += words[i].charAt(j);               //добавляю в "множества букв слова"
                }
            }
            rezSTR += letter + " ";                             //собираю из "множеств букв слов" строку
            System.out.println(rezSTR);                       //new sundaytr golp or are to
        }
        String[] resWORDS = rezSTR.split(" ");            //вношу строку множеств в массив разбив по пробельному символу на слова
        int min = resWORDS[0].length(), indexMIN = 0;
        for (int i = 1; i < resWORDS.length; i++) {
            if (resWORDS[i].length() < min) {                   //нахожу минимальную длину "слова множеств"
                min = resWORDS[i].length();
                indexMIN = i;                                   //фиксирую индекс минимального "слова множеств"
            }
        }
        System.out.println(words[indexMIN]);                    //т. к. индекс "слова множеств" == индексу слова в массиве, то вывожу искомое слово
    }
}
