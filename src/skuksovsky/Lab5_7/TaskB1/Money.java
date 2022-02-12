package skuksovsky.Lab5_7.TaskB1;

class Money {
    String name;
    final private byte NUMBER_OF_KOPECKS_IN_RUBLE = 100;
    private boolean ifActualAmountIsNegative;
    private long integerPart;
    private char fractionalPart;

    public Money(String name) {
        this.name = name;
        this.integerPart = 0;
        this.fractionalPart = 0;
    }

    private long transferExistingToKopecks(){
        if (ifActualAmountIsNegative) {
            return (integerPart == 0) ? -((int) fractionalPart) : integerPart * NUMBER_OF_KOPECKS_IN_RUBLE - fractionalPart;
        } else {
            return integerPart * NUMBER_OF_KOPECKS_IN_RUBLE + fractionalPart;
        }
        // return (ifActualAmountIsNegative && integerPart == 0) ? -((int) fractionalPart) : integerPart * NUMBER_OF_KOPECKS_IN_RUBLE + fractionalPart; - 2500 + 80 = -2420
    }

    private long transferToLong(double number) {
        long result;
        if (number < 0) {
            result = (long) Math.ceil((number / NUMBER_OF_KOPECKS_IN_RUBLE));
        }else {
            result = (long) Math.floor((number / NUMBER_OF_KOPECKS_IN_RUBLE));
        }
        return result;
    }

    private char transferToChar(double number) {
        char result;
        ifActualAmountIsNegative = number < 0;
        result = (char) Math.round(((Math.abs(number) / NUMBER_OF_KOPECKS_IN_RUBLE) - Math.abs(integerPart)) * NUMBER_OF_KOPECKS_IN_RUBLE);
        return result;
    }

    void topUp(double amount) {
        amount *= NUMBER_OF_KOPECKS_IN_RUBLE;
        double newAmount = transferExistingToKopecks() + amount;
        integerPart = transferToLong(newAmount);
        fractionalPart = transferToChar(newAmount);
    }

    void subtraction(double amount) {
        amount *= NUMBER_OF_KOPECKS_IN_RUBLE;
        double newAmount = transferExistingToKopecks() - amount;
        integerPart = transferToLong(newAmount);
        fractionalPart = transferToChar(newAmount);
    }

    void multiplication(double number) {
        double newAmount = number * transferExistingToKopecks();
        integerPart = transferToLong(newAmount);
        fractionalPart = transferToChar(newAmount);
    }

    void division(double number) {
        double newAmount = transferExistingToKopecks() / number;
        integerPart = transferToLong(newAmount);
        fractionalPart = transferToChar(newAmount);
    }

    void compare(double amount) {
        amount *= 100;
        long actualAmount = transferExistingToKopecks();
        if (amount > actualAmount) {
            System.out.println("Введенная сумма больше текущего баланса кошелька " + name);
        } else if (amount < actualAmount) {
            System.out.println("Введенная сумма меньше текущего баланса кошелька " + name);
        } else {
            System.out.println("Введенная сумма равна текущему балансу кошелька " + name);
        }
    }


    void showBalance(){
        if (fractionalPart > 9) {
            System.out.print("Баланс кошелька " + name + " составляет ");
            System.out.print((ifActualAmountIsNegative & integerPart == 0) ? "-" : "");
            System.out.println(integerPart + "," + (int) fractionalPart + " рублей");
        } else {
            System.out.print("Баланс кошелька " + name + " составляет ");
            System.out.print((ifActualAmountIsNegative & integerPart == 0) ? "-" : "");
            System.out.println(integerPart + ",0" + (int) fractionalPart + " рублей");
        }
    }

    public void getFractionalPart() {
        System.out.println(Integer.valueOf(fractionalPart));;
    }

    public void getIntegerPart() {
        System.out.println(Long.valueOf(integerPart));;
    }
}