package eveshtard.Lab4;
//Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк:");
        int numberOfLines = Integer.parseInt(reader.readLine());

    }
}
