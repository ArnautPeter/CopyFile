import java.io.Serializable;

public class Owner implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String lastName;
    private int age;

    public Owner(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return "Owner{" +
                "name = " + name +
                ", age = " + age +
                '}';
    }
}
