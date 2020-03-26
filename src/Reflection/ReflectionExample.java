package Reflection;

import java.lang.reflect.Field;

public class ReflectionExample {
    Person person = new Person("Person1", 11);
        System.out.println(person);


    Class<Person> personClass = Person.class;
        try {
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(person, "Peter");
        nameField.setAccessible(false);
        System.out.println(person);
    } catch (NoSuchFieldException | IllegalAccessException e) {
        e.printStackTrace();
    }



//        try {
//            person = (Person) Class.forName("com.secorse.reflection.Person").newInstance();
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        Field[] fields = personClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
}
