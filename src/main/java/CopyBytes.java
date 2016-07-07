import java.io.*;

public class CopyBytes {

    public static void main(String[] args) {

        File file = new File("E:\\git_java\\Lesson28\\in1.txt");
        File outPutFile = new File("E:\\git_java\\Lesson28\\on1.txt");

        byte[] arr = readFromFile(file);
        writeToFile(arr, outPutFile);
    }

    private static byte[] readFromFile(File file) {

        byte[] arr = null;

        try (FileInputStream inputStream = new FileInputStream(file)) {

            int value;
            arr = new byte[(int) file.length()];
            int index = 0;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
                arr[index++] = (byte) value;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    private static void writeToFile(byte[] arr, File file) {

        try (FileOutputStream outputStream = new FileOutputStream(file)){
            for (byte b : arr){
                outputStream.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
