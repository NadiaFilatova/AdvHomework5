package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Modifier;
import java.util.Arrays;

//Напишіть програму, яка виводитиме всю інформацію про клас, користувач сам вибирає, який саме клас цікавить.
public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введіть назву класу (Назва папки.Назва класу).");
        System.out.println("Приклад: task2.WithPrivateFinalField");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Class<?> clazz = Class.forName(reader.readLine());
            analyzeClass(clazz);
        } catch (ClassNotFoundException e) {
            System.out.println(e + " -  Цей клас не знайдено." +
                    " Перевірне правильність написання, зверніть увагу на регістр. " +
                    "Обов'язково вкажіть папку(місце розташування класу), як це показано у прикладі");
        }

    }

    public static void analyzeClass(Class<?> clazz) {
        System.out.println("Імя класу: " + clazz);
        System.out.println("Модифікатор доступу вказаного класу: " + Modifier.toString(clazz.getModifiers()));
        System.out.println("Поля класу та їх модифікатори доступу: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Батьківський клас: " + clazz.getSuperclass());
        System.out.println("Методи класу та їх модифікатори: " + Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("Конструктори класу та їх модифікатори: " + Arrays.toString(clazz.getConstructors()));
    }
}
