package ssazonenko.lab10.Generic.TaskOne;


import java.util.Scanner;

public class Main {
    public static void main (String [] args)  {
            System.out.println("Выберите масиив данных, который хотите обработать:" + '\n' +
                    "1.int" + '\n' +
                    "2.byte" + '\n' +
                    "3.short" + '\n' +
                    "4.float" + '\n' +
                    "5.double" + '\n' +
                    "6.long" + '\n' +
                    "7.string" + '\n');
            Scanner console = new Scanner(System.in);
            int number = console.nextInt();
            switch (number) {
                case 1:
                     Integer [] arrayInteger = new Integer[]{1 , 2 , 3 , 4 , 5};
                    TaskOne<Integer> intArray = new TaskOne<>(arrayInteger);
                    intArray.choose(arrayInteger);
                    break;
                case 2:
                    Byte [] arrayByte = new Byte[]{1 , 2 , 3 , 4 , 5};
                    TaskOne <Byte> byteArray = new TaskOne<>(arrayByte);
                    byteArray.choose(arrayByte);
                    break;
                case 3:
                    Short [] arrayShort = new Short[]{1 , 2 , 3 , 4 , 5};
                    TaskOne <Short> shortArray = new TaskOne<>(arrayShort);
                    shortArray.choose(arrayShort);
                    break;
                case 4:
                    Float [] arrayFloat = new Float[]{1.0f , 2.0f , 3.0f , 4.0f , 5.0f};
                    TaskOne <Float> floatArray = new TaskOne<>(arrayFloat);
                    floatArray.choose(arrayFloat);
                    break;
                case 5:
                    Double [] arrayDouble = new Double[]{1.0 , 2.0 , 3.0 , 4.0 , 5.0};
                    TaskOne <Double> doubleArray = new TaskOne<>(arrayDouble);
                    doubleArray.choose(arrayDouble);
                    break;
                case 6:
                    Long [] arrayLong = new Long[]{1L , 2L , 3L , 4L , 5L};
                    TaskOne <Long> longArray = new TaskOne<>(arrayLong);
                    longArray.choose(arrayLong);
                    break;
                case 7:
                    String [] arrayString = new String[]{"Привет" , "Пока" , "Джава" , "Книга" , "Стол"};
                    TaskOne <String> stringArray = new TaskOne<>(arrayString);
                    stringArray.choose(arrayString);
                    break;
            }
        }
    }

