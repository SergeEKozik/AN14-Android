package eveshtard.Lab6.Human;

import eveshtard.Lab6.Human.Jacket.AdidasJacked;
import eveshtard.Lab6.Human.Shoes.AsicsShoes;
import eveshtard.Lab6.Human.Trousers.BigStarsTrousers;

/*
       По аналогии с первым задание делаем след. задание.
        Интерфейсы:
        - Куртка
        - Штаны
        - Обувь
        в каждом интерфейсе есть 2 метода (надеть и снять)
        Делаем несколько реализации каждого интерфейса.
        Создаём класс человек:
        У человека поля:
        -имя.
        -куртка.
        -штаны.
        -обувь.
        У человека есть 2 метода:
        - одеться(вызываются методы надеть у всех вещей)
        - раздеться (вызываются методы снять у всех вещей)*/

public class Run {

    public static void main(String[] args) {
        Human anton = new Human("Anton", new AdidasJacked(), new AsicsShoes(), new BigStarsTrousers());

        anton.putOn();
        anton.takeOff();
    }
}
