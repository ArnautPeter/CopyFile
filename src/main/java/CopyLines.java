import java.io.*;

public class CopyLines {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("E:" + File.separator + "git_java" + File.separator + "Lesson28" + File.separator + "in3.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("E:" + File.separator + "git_java" + File.separator + "Lesson28" + File.separator + "on3.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String line;
        while ((line = reader.readLine()) != null) {

            String[] arr = line.split(" ");
            for (String word : arr) {
                writer.write(word);
                writer.newLine();
            }
        }

        writer.close();
    }
}
