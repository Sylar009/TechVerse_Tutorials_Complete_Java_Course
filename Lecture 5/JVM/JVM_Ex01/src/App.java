import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        Person person = new Person();

        // Get Class object
        Class<?> cls = person.getClass();

        // Print class name
        System.out.println("Class Name: " + cls.getName());

        // Print methods
        Method[] methods = cls.getDeclaredMethods();
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println("- " + method.getName());
        }

        // Print fields
        Field[] fields = cls.getDeclaredFields();
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println("- " + field.getName());
        }
    }
}

class Person {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
