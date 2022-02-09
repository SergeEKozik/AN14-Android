package achapovskiy.lab5.B1.var2;

public class main {
    public static void main(String[] args) {

        Acount acFirst = new Acount(45,'9');   //объект класса Acount
        Acount acSecond = new Acount(13,'7');  //объект класса Acount

        acFirst.Operation();
        System.out.println(acFirst.Sum(acSecond));
        System.out.println(acFirst.Dif(acSecond));
        System.out.println(acFirst.Div(acSecond));
        System.out.println(acFirst.DivSum());
        System.out.println(acFirst.comparison(acSecond));

    }
}
