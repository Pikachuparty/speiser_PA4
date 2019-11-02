import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Application {

    public static void main (String args[]) throws IOException {

        FileInputStream fileByteStream = null;
        FileWriter bls = null;

        DuplicateRemover dupeRemover = new DuplicateRemover();

        try {
            fileByteStream = new FileInputStream("problem1.txt");
            bls = new FileWriter("unique_words.txt");
            dupeRemover.remove(fileByteStream);
            dupeRemover.write(bls);

        } catch (IOException exception) {

            System.out.println(exception.getMessage());

        } finally {

            try {

                if (fileByteStream != null) {
                    fileByteStream.close();
                }
                if (bls != null) {

                    bls.close();
                }

            } catch (IOException c) {

                System.out.println(c.getMessage());

            }

        }

    }
}
