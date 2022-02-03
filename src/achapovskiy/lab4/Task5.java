package achapovskiy.lab4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), poolLetter = "", dictEngWords = "";
        String[] words = str.split(" ");                                          //Лот dog гитаRA github dear NewГод Java Дом Big ЧелоVEk Pig
        for (int i = 0; i < words.length; i++) {                                        //проход по словам
            for (int j = 0; j < words[i].length(); j++) {                               //проход по буквам в слове
                if ((words[i].charAt(j) >= 'A' && words[i].charAt(j) <= 'Z') || (words[i].charAt(j) >= 'a' && words[i].charAt(j) <= 'z')) {
                    poolLetter += words[i].charAt(j);                                   //собираем английское слово
                } else {
                    poolLetter = "";
                    break;
                }
            }
            if (poolLetter != "")
                dictEngWords += poolLetter + " ";                                      //дополняем строку английскими словами
            poolLetter = "";                                                           //"обнуляем" слово
        }
        System.out.println("Английские слова : " + dictEngWords);
        System.out.println("Количество английских слов : " + dictEngWords.split(" ").length);
        //находим из слова с равным числом гласных и согласных букв
        int kolVowels = 0, kolConsonants = 0;
        String rezult = "";
        String[] Dict = dictEngWords.split(" ");                                 //создаю массив английских слов
        for (int index = 0; index < Dict.length; index++) {                            //проход по английским словам
            //System.out.println("слово " + Dict[index]);
            for (int letter = 0; letter < Dict[index].length(); letter++) {            //проход по буквам в слове
                //System.out.println("буква " + Dict[index].charAt(letter));
                if (Dict[index].charAt(letter) == 'A' || Dict[index].charAt(letter) == 'E' || Dict[index].charAt(letter) == 'I'
                        || Dict[index].charAt(letter) == 'O' || Dict[index].charAt(letter) == 'U' || Dict[index].charAt(letter) == 'Y' || Dict[index].charAt(letter) == 'a'
                        || Dict[index].charAt(letter) == 'e' || Dict[index].charAt(letter) == 'i' || Dict[index].charAt(letter) == 'o' || Dict[index].charAt(letter) == 'u'
                        || Dict[index].charAt(letter) == 'y') {
                    kolVowels += 1;                                                    //счётчик гласных букв
                }
                else {
                    kolConsonants += 1;                                                //счётчик согласных букв
                }
            }
            if (kolVowels == kolConsonants){
                rezult += Dict[index] + " ";
            }
            kolConsonants = 0; kolVowels = 0;
        }
        System.out.println(rezult);
        System.out.println("Количество слов с одинаковым числом гласных и согласных бкув : " + rezult.split(" ").length);
    }
}

