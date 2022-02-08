package akutsenkou.person;

import akutsenkou.person.Jakcet.IJakcet;
import akutsenkou.person.Pants.IPants;
import akutsenkou.person.Shoes.IShoes;

public class Person implements IPerson{
    private String name;
    private IJakcet jacket;
    private IPants pants;
    private IShoes shoes;

    public Person (String name, IJakcet jacket, IPants pants, IShoes shoes){
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Person (){

    }

    public String getName() {
        return name;
    }

    @Override
    public void undress() {
        jacket.undress();
        pants.undress();
        shoes.undress();
    }

    @Override
    public void dress() {
        jacket.dress();
        pants.dress();
        shoes.dress();
    }
}
