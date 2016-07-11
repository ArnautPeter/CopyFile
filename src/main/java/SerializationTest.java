import java.io.*;

public class SerializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Owner owner = new Owner("Mike", "Ghj", 25);
        Dog dog = new Dog("Sharik", 5, owner);
        serializeDog(dog);
        Dog dogDeser = deserializeDog();
        System.out.println(dogDeser.toString());
    }

    private static void serializeDog(Dog dog) {

        try (FileOutputStream fileOutputStream = new FileOutputStream("e:\\dog.ser");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {

            outputStream.writeObject(dog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Dog deserializeDog() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("e:\\dog.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (Dog) objectInputStream.readObject();
    }
}