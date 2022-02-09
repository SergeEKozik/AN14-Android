package VNazarov.Lab05.TaskB1;

public class Money {

    private long rubles;
    private char decimalPennies;
    private char singlePennies;

    private int intAmount;
    private String Length;

    Money (long rubles, char decimalPennies, char singlePennies){
/**
        String dp = String.valueOf(decimalPennies);
        String sp = String.valueOf(singlePennies);

        if (dp.matches("\\d")) this.decimalPennies = decimalPennies;
        else{
            System.out.print("Invalid decimal pennies of this number. ");
            decimalPennies = '0';
            System.out.print("Decimal pennies now are null." + "\n");
        }
        if (sp.matches("\\d")) this.singlePennies = singlePennies;
        else{
            System.out.print("Invalid single pennies of this number. ");
            singlePennies = '0';
            System.out.print("Decimal pennies now are null." + "\n");
        }
**/ //Initially there was a check for characters in Pennies, but I added an input check in the main method

        this.decimalPennies = decimalPennies;
        this.singlePennies = singlePennies;
        this.rubles = rubles;
        System.out.println("Amount of money " + Money.this + " created." + "\n");

        Length = String.valueOf(rubles) + String.valueOf(decimalPennies) + String.valueOf(singlePennies);
        intAmount = Integer.parseInt(Length);
    }

    private static int sumS(Money first, Money second){
        int result = 0;
        result = first.intAmount + second.intAmount;
        return result;
    }
    public static String sum (Money first, Money second){
        int result = Money.sumS(first, second);
        int[] resMas = new int[String.valueOf(result).length()];

        for (int index = resMas.length - 1; index > -1 ; index--) {
            resMas[index] = result % 10;
            result /= 10;
        }

        String[] finalResMas = new String[resMas.length + 1];
        int helpIndex = resMas.length - 1;

        for (int index = finalResMas.length - 1; index > -1; index--) {
            if (index != finalResMas.length - 3){
                finalResMas[index] = String.valueOf(resMas[helpIndex]);
                    if (helpIndex > - 1) helpIndex--;
            } else if (index == finalResMas.length - 3) finalResMas[index] = ",";
        }

        String finalRes = "";
        for (int index = 0; index < finalResMas.length; index++) {
            finalRes = finalRes + finalResMas[index];
        }

        return finalRes;
    }

    private static int subsS(Money first, Money second){
        int result = 0;
        if (first.intAmount >= second.intAmount){
            result = first.intAmount - second.intAmount;
        } else if (first.intAmount <= second.intAmount){
            result = second.intAmount - first.intAmount;
        }
        return result;
    }
    public static String subs(Money first, Money second){
        int result = Money.subsS(first, second);
        int[] resMas = new int[String.valueOf(result).length()];

        for (int index = resMas.length - 1; index > -1 ; index--) {
            resMas[index] = result % 10;
            result /= 10;
        }

        String[] finalResMas = new String[resMas.length + 1];
        int helpIndex = resMas.length - 1;

        for (int index = finalResMas.length - 1; index > -1; index--) {
            if (index != finalResMas.length - 3){
                finalResMas[index] = String.valueOf(resMas[helpIndex]);
                if (helpIndex > - 1) helpIndex--;
            } else if (index == finalResMas.length - 3) finalResMas[index] = ",";
        }

        String finalRes = "";
        for (int index = 0; index < finalResMas.length; index++) {
            finalRes = finalRes + finalResMas[index];
        }

        return finalRes;
    }

    private static int divS(Money first, Money second){
        int result = 0;
        if (first.intAmount >= second.intAmount){
            result = (int)(((double)first.intAmount) / (((double)second.intAmount)) * 100);
        } else if (first.intAmount <= second.intAmount){
            result = (int)(((double)second.intAmount) / (((double)first.intAmount)) * 100);
        }
        return result;
    }
    public static String div(Money first, Money second){
        int result = Money.divS(first, second);
        int[] resMas = new int[String.valueOf(result).length()];

        for (int index = resMas.length - 1; index > -1 ; index--) {
            resMas[index] = result % 10;
            result /= 10;
        }

        String[] finalResMas = new String[resMas.length + 1];
        int helpIndex = resMas.length - 1;

        for (int index = finalResMas.length - 1; index > -1; index--) {
            if (index != finalResMas.length - 3){
                finalResMas[index] = String.valueOf(resMas[helpIndex]);
                if (helpIndex > - 1) helpIndex--;
            } else if (index == finalResMas.length - 3) finalResMas[index] = ",";
        }

        String finalRes = "";
        for (int index = 0; index < finalResMas.length; index++) {
            finalRes = finalRes + finalResMas[index];
        }

        return finalRes;
    }

    private static int frDivS(Money first, double fractional){
        int result = 0;
            result = (int)((double)first.intAmount / fractional);
        return result;
    }
    public static String frDiv(Money first, double fractional){
        int result = Money.frDivS(first, fractional);
        int[] resMas = new int[String.valueOf(result).length()];

        for (int index = resMas.length - 1; index > -1 ; index--) {
            resMas[index] = result % 10;
            result /= 10;
        }

        String[] finalResMas = new String[resMas.length + 1];
        int helpIndex = resMas.length - 1;

        for (int index = finalResMas.length - 1; index > -1; index--) {
            if (index != finalResMas.length - 3){
                finalResMas[index] = String.valueOf(resMas[helpIndex]);
                if (helpIndex > - 1) helpIndex--;
            } else if (index == finalResMas.length - 3) finalResMas[index] = ",";
        }

        String finalRes = "";
        for (int index = 0; index < finalResMas.length; index++) {
            finalRes = finalRes + finalResMas[index];
        }

        return finalRes;
    }

    private static int frMultiplyS(Money first, double fractional){
        int result = 0;
        result = (int)((double)first.intAmount * fractional);
        return result;
    }
    public static String frMultiply(Money first, double fractional){
        int result = Money.frMultiplyS(first, fractional);
        int[] resMas = new int[String.valueOf(result).length()];

        for (int index = resMas.length - 1; index > -1 ; index--) {
            resMas[index] = result % 10;
            result /= 10;
        }

        String[] finalResMas = new String[resMas.length + 1];
        int helpIndex = resMas.length - 1;

        for (int index = finalResMas.length - 1; index > -1; index--) {
            if (index != finalResMas.length - 3){
                finalResMas[index] = String.valueOf(resMas[helpIndex]);
                if (helpIndex > - 1) helpIndex--;
            } else if (index == finalResMas.length - 3) finalResMas[index] = ",";
        }

        String finalRes = "";
        for (int index = 0; index < finalResMas.length; index++) {
            finalRes = finalRes + finalResMas[index];
        }

        return finalRes;
    }

    public static String comp(Money first, Money second){
        int comparsion = 0;
        if (first.intAmount > second.intAmount) comparsion = 1;
        else if (first.intAmount < second.intAmount) comparsion = 2;
        else if (first.intAmount == second.intAmount) comparsion = 0;

        String isMoreOrLess = "";
        if (comparsion == 1) isMoreOrLess = "The first amount is more than the second";
        else if (comparsion == 2) isMoreOrLess = "The second amount is more than the first";
        else if (comparsion == 0) isMoreOrLess = "The amounts are equal";
        return isMoreOrLess;
    }
}
