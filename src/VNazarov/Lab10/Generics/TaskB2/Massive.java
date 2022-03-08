package VNazarov.Lab10.Generics.TaskB2;

import java.util.ArrayList;
import java.util.List;

public class Massive {
    private List<String> strList = new ArrayList<>();
    private String regexForNumbers = "^[0-9]*\\.?[0-9]*$";
    private String regexForInts = "^[0-9]*\\.0$";
    private float[] flMas;

    public Massive(List list){
        for (Object o : list) {
            strList.add(o.toString());
        }
    }

    private void removeNotNumbers(){
        strList.removeIf(s -> !s.matches(regexForNumbers));
    }

    private void sort(){
        removeNotNumbers();
        flMas = new float[strList.size()];

        for (int index = 0; index < flMas.length; index++) {
            flMas[index] = Float.parseFloat(strList.get(index));
        }

        for (int index = 1; index < flMas.length; index++) {
            float elementForSort;
            if (flMas[index] < flMas[index - 1]){
                elementForSort = flMas[index];
                flMas[index] = flMas[index - 1];
                flMas[index - 1] = elementForSort;
            }
        }
    }

    private void strListRemoveAll(){
        for (int index1 = 0; index1 < strList.size(); index1++) {
            strList.remove(index1);
            index1--;
        }
    }

    public void getMaxAndMin(){
        sort();
        strListRemoveAll();

        for (float flMa : flMas) {
            strList.add(String.valueOf(flMa));
        }

        String min, max;

        if (strList.get(0).matches(regexForInts)){
            StringBuffer stringBuffer = new StringBuffer(strList.get(0));
            stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length());
            min = String.valueOf(stringBuffer);
        }else min = strList.get(0);

        if (strList.get(strList.size() - 1).matches(regexForInts)){
            StringBuffer stringBuffer = new StringBuffer(strList.get(strList.size() - 1));
            stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length());
            max = String.valueOf(stringBuffer);
        }else max = strList.get(strList.size() - 1);

        System.out.println("Min element is " + min);
        System.out.println("Max element is " + max);
    }

    public void display(){
        System.out.println(strList);
    }
}
