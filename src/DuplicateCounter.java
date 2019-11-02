import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class DuplicateCounter {

    private Integer wordCounter;
    private HashMap <String, Integer> words = new HashMap <String, Integer>();

    public void counter (FileInputStream dataFile) throws IOException {

        Scanner reader = new Scanner(dataFile);

        while (reader.hasNext()) {

            String word = reader.next();
            wordCounter = words.get(word);

            if(wordCounter != null ) {
                wordCounter++;

            }

            else {

                wordCounter = 1;

            }

            words.put (word, wordCounter);

        }

        reader.close();
    }

    public void write (FileOutputStream outputFile) throws IOException {

        PrintWriter ou = new PrintWriter(outputFile);
        ou.println(words);
        ou.flush();
        outputFile.close();
    }

}



