package akutsenkou.Lesson5_7.TaskB1;

public class Money {

    private long rub;
    private char cop;

    public Money(long rub, char cop) {
        this.rub = rub;
        this.cop = cop;
    }

    public Money() {

    }

    public void sum(Money num1, Money num2) {

        final int RADIX = 10;
        long sumRub = num1.rub + num2.rub;
        long sumCop = Character.getNumericValue(num1.cop) + Character.getNumericValue(num2.cop);
        if (sumCop > 9) {
            sumRub++;
            sumCop -= 10;
        }
        System.out.print("Summa: ");
        System.out.println(sumRub + "," + Character.forDigit((int) sumCop, RADIX));

    }

    public void difference (Money num1, Money num2) {

        final int RADIX = 10;
        long difRub = num1.rub - num2.rub;
        long difCop = Character.getNumericValue(num1.cop) - Character.getNumericValue(num2.cop);
        if (difCop < 0) {
            difRub--;
            difCop += 10;
        }
        System.out.print("Difference: ");
        System.out.println(difRub + "," + Character.forDigit((int) difCop, RADIX));

    }

    public void division (Money num1, Money num2) {
        final int RADIX = 10;
        double number1 = (double)num1.rub + Character.getNumericValue(num1.cop) * 0.1;
        double number2 = (double)num2.rub + Character.getNumericValue(num2.cop) * 0.1;
        double div = number1 / number2;
        long divRub = (long)div;
        char divCop = Character.forDigit((int) div%10, RADIX);
        System.out.print("Division: ");
        System.out.println(divRub + "," + divCop);

    }

    public  void multiplication (Money num1, Money num2){
        final int RADIX = 10;
        double number1 = (double)num1.rub + Character.getNumericValue(num1.cop) * 0.1;
        double number2 = (double)num2.rub + Character.getNumericValue(num2.cop) * 0.1;
        double mult = number1 * number2;
        long multRub = (long) mult;
        char multCop = Character.forDigit((int) mult%10, RADIX);
        System.out.print("Multiplication: ");
        System.out.println(multRub + "," + multCop);
    }

    public void comparison (Money num1, Money num2){
        final int RADIX = 10;
        double number1 = (double)num1.rub + Character.getNumericValue(num1.cop) * 0.1;
        double number2 = (double)num2.rub + Character.getNumericValue(num2.cop) * 0.1;
        long num1Rub = (long) number1;
        long num2Rub = (long) number2;
        char num1Cop = Character.forDigit((int) number1%10, RADIX);
        char num2Cop = Character.forDigit((int) number2%10, RADIX);
        System.out.print("Comparison: ");
        if(number1 > number2){
            System.out.println(num1Rub + "," + num1Cop + " > " + num2Rub + "," + num2Cop);
        }
        else {
            System.out.println(num2Rub + "," + num2Cop + " > " + num1Rub + "," + num1Cop);
        }
    }


}
