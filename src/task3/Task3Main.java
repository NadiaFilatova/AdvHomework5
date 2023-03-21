package task3;

import java.lang.reflect.Modifier;
import java.util.Arrays;

//Використовуючи рефлексію отримайте всю інформацію про поля, методи, конструктори, а також модифікатори доступу.
public class Task3Main {
    public static void main(String[] args) {
        analyzeClass(new Task3(12, "name", 45));
    }

    public static void analyzeClass(Object o) {
        Class clazz = o.getClass();
        System.out.println("Імя класу: " + clazz);
        System.out.println("Модифікатор доступу вказаного класу: " + Modifier.toString(clazz.getModifiers()));
        System.out.println("Поля класу та їх модифікатори доступу: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Батьківський клас: " + clazz.getSuperclass());
        System.out.println("Методи класу та їх модифікатори: " + Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("Конструктори класу та їх модифікатори: " + Arrays.toString(clazz.getConstructors()));
    }
}
