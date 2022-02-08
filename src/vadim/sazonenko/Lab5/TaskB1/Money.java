package vadim.sazonenko.Lab5.TaskB1;

public class Money {
    private long rublesOne, rublesTwo ;
    private char penniesOne, penniesTwo;

    Money(long rublesOne, long rublesTwo, char penniesOne, char penniesTwo) {
        this.rublesOne = rublesOne;
        this.penniesOne = penniesOne;
        this.rublesTwo = rublesTwo;
        this.penniesTwo = penniesTwo;
    }

    void sum () {

        long sumRubles =  rublesOne + rublesTwo;
        double sumPennies = Character.getNumericValue(penniesOne) + Character.getNumericValue(penniesTwo);
        if (sumPennies > 9) {
            sumRubles++;
            sumPennies =  (sumPennies - 10) / 10;

        }
        double summa = sumPennies + sumRubles;
        System.out.println("Сумма: " + summa);
    }
    void difference () {

        long differenceRubles =  rublesOne - rublesTwo;
        double onePennies = 0;
        if (penniesOne < penniesTwo){
        differenceRubles--;
        onePennies = Character.getNumericValue(penniesOne) +  10;
        }
        double differencePennies = (onePennies - Character.getNumericValue(penniesTwo)) / 10;

        double difference = differencePennies + differenceRubles;
        System.out.println("Разность: " + difference);
    }

    void division () {

        double divisionPenniesOne = Character.getNumericValue(penniesOne);
        divisionPenniesOne = divisionPenniesOne / 10;
        double divisionPenniesTwo = Character.getNumericValue(penniesTwo);
        divisionPenniesTwo = divisionPenniesTwo / 10;
        double sumOne = rublesOne + divisionPenniesOne;
        double sumTwo = rublesTwo + divisionPenniesTwo;
        double division = sumOne / sumTwo;
        System.out.println("Деление: " + division);


    }

    double divisionSumFractional(double number) {

        long sumRubles =  rublesOne + rublesTwo;
        double sumPennies = Character.getNumericValue(penniesOne) + Character.getNumericValue(penniesTwo);
        if (sumPennies > 9) {
            sumRubles++;
            sumPennies =  (sumPennies - 10) / 10;

        }
        double summa = (sumPennies + sumRubles) / number;
        return summa;
    }

    double multiplicationSumFractional(double number) {

        long sumRubles =  rublesOne + rublesTwo;
        double sumPennies = Character.getNumericValue(penniesOne) + Character.getNumericValue(penniesTwo);
        if (sumPennies > 9) {
            sumRubles++;
            sumPennies =  (sumPennies - 10) / 10;

        }
        double summa = (sumPennies + sumRubles) * number;
        return summa;
    }

    void comparison () {

        boolean test;
        long sumRubles = rublesOne + rublesTwo;
        double onePennies = Character.getNumericValue(penniesOne);
        onePennies = onePennies / 10;
        double twoPennies = Character.getNumericValue(penniesTwo);
        twoPennies = twoPennies / 10;
        double sumOne = rublesOne + onePennies;
        double sumTwo = rublesTwo + twoPennies;
        if (sumOne > sumTwo) {
            test = true;
        } else {
            test = false;

        }
        System.out.println("Первая сумма больше второй: " + test);
    }



    }

