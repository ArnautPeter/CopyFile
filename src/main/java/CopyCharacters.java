import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("E:" + File.separator + "git_java" + File.separator + "Lesson28" + File.separator + "in2.txt");
            fileWriter = new FileWriter("E:" + File.separator + "git_java" + File.separator + "Lesson28" + File.separator + "on2.txt");
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
                fileWriter.write(ch);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {

            fileWriter.flush(); //!!!
            fileReader.close();
            fileWriter.close();
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
