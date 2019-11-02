import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.util.ArrayList;

public class DuplicateRemover {

    private ArrayList <String> uniqueWords = new ArrayList<String>();

    public void remove (FileInputStream dataFile) throws IOException {

        Scanner reader = new Scanner(dataFile);

        while (reader.hasNext()) {

            uniqueWords.add(reader.next());
        }

        Set <String> wordList = new HashSet<>(uniqueWords);
        uniqueWords.clear();
        uniqueWords.addAll(wordList);

        reader.close();

    }

    public void write (FileWriter outputFile) throws IOException {

        int i;

        for (i = 0; i<uniqueWords.size(); i++) {

            outputFile.write(uniqueWords.get(i));
            outputFile.write("\n");
            outputFile.flush();
        }
        outputFile.close();

    }

}
