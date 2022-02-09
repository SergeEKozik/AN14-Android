package kdavydenko.Lesson5.Human;

import kdavydenko.Lesson5.Human.Jacket.WinterJacket;
import kdavydenko.Lesson5.Human.Pants.Jeans;
import kdavydenko.Lesson5.Human.Shoes.Boots;
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
-имя
-куртка
-штаны
-обувь
У человека есть 2 метода:
- одеться(вызываются методы надетьдеть у всех вещей)
- раздеться (вызываются методы снять у всех вещей)
 */
public class Run {
    public static void main(String[] args) {
        Human human = new Human("Kolya", new WinterJacket(), new Jeans(), new Boots());

        human.getHumanName();

        human.getDressed();

        human.undress();
    }
}
