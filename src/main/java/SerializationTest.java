import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

    public static void main(String[] args) {

        Dog dog = new Dog("Sharik", 5);
        serializeDog(dog);
    }

    private static void serializeDog(Dog dog) {

        try (FileOutputStream fileOutputStream = new FileOutputStream("e:\\dog.ser");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {

            outputStream.writeObject(dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
