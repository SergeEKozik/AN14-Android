package kvizhunou.Lab6.Man;

import kvizhunou.Lab6.Man.Human;
import kvizhunou.Lab6.Man.Jacket.VipJacket;
import kvizhunou.Lab6.Man.Shoes.BsinessShoes;
import kvizhunou.Lab6.Man.Trousers.ClassicalJeans;

public class mainMan {
    public static void main(String[] args) {
        Human human = new Human("Кирилл",new VipJacket(),new ClassicalJeans(),new BsinessShoes());
        human.getName();
        human.putOn();
        human.takeOff();

    }

}
