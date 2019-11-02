import java.io.*;

public class Application {

    public static void main (String args []) throws IOException {

        FileInputStream inputFile = null;
        FileOutputStream outputFile = null;

        try {

            inputFile = new FileInputStream("problem2.txt");
            outputFile = new FileOutputStream("unique_word_counts.txt");
            DuplicateCounter dupeCounter = new DuplicateCounter();
            dupeCounter.counter(inputFile);
            dupeCounter.write(outputFile);

        }

        catch (Exception c) {

            System.out.println(c.getMessage());

        }

        finally {

            try {

                inputFile.close();
                outputFile.close();
            }

            catch (Exception c) {

                c.getMessage();

            }
        }

    }




}
