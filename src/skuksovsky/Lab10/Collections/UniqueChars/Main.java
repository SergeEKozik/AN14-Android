package skuksovsky.Lab10.Collections.UniqueChars;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args)  {
        try {
            String text = Files.readString(Path.of("src/skuksovsky/Lab10/Collections/test_text"), StandardCharsets.UTF_8);
            UniqueChars uniqueChars = new UniqueChars();
            uniqueChars.setText(text);

            uniqueChars.calculateLetters(false);
            System.out.println(uniqueChars);

            uniqueChars.calculateLetters(true);
            System.out.println(uniqueChars);

            uniqueChars.calculateDigits();
            System.out.println(uniqueChars);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
