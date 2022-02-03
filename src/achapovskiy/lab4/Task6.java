package achapovskiy.lab4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(),poolLetter = "", dictEngWords = "";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {                        //проход по словам
            for (int j = 0; j < words[i].length(); j++) {               //проход по буквам в слове
                //System.out.print(words[i].charAt(j)+ " ");
                if ((words[i].charAt(j) >= 'A' && words[i].charAt(j) <= 'Z') || (words[i].charAt(j) >= 'a' && words[i].charAt(j) <= 'z')) {
                    poolLetter += words[i].charAt(j);                   //собираем английское слово
                }
                else {
                    poolLetter = "";
                    break;
                }
            }
            if(poolLetter != "")
                dictEngWords += poolLetter + " ";                          //дополняем строку английскими словами
            poolLetter = "";                                           //"обнуляем" слово
        }
        System.out.println(dictEngWords);                                  //выводим английские слова
        System.out.print("Количество английских слов : ");
        System.out.println(dictEngWords.split(" ").length);          // выводим количество английских слов
        //находим из слова с равным числом гласных и согласных букв
        int kolVowels = 0, kolConsonants=0;
        String [] Dict = dictEngWords.split(" ");                              //создаю массив английских слов
        for (int index = 0; index < Dict.length; index++)  {                           //проход по английским словам
            if (Dict[index].length() % 2 == 0 ) {                                    //слово должно иметь чётное количество букв , чтобы удовлетворять условию
                System.out.println("слово " +Dict[index]);
                for (int letter = 0; letter < Dict[index].length(); letter++ ){
                    if (Dict[index].charAt(letter)=='A' || Dict[index].charAt(letter)=='E' || Dict[index].charAt(letter)=='I'
                            || Dict[index].charAt(letter)=='O' || Dict[index].charAt(letter)=='U' || Dict[index].charAt(letter)=='Y' || Dict[index].charAt(letter)=='a'
                            || Dict[index].charAt(letter)=='e' || Dict[index].charAt(letter)=='i' || Dict[index].charAt(letter)=='o' || Dict[index].charAt(letter)=='u'
                            || Dict[index].charAt(letter)=='y'){
                        kolVowels +=1;
                    }
                    else {
                        kolConsonants +=1;
                    }
                }

            }
            if (kolVowels == kolConsonants){
                System.out.println("вывод " + Dict[index]);

            }
        }
    }}