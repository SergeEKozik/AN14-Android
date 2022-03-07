package kvizhunou.Lab10;

public class Generick<K> {
    private K[]value;
public Generick(K []value){
    this.value=value;
}

    public K getValue(int index) {
        return value[index];}
    }

